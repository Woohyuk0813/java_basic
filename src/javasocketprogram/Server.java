package javasocketprogram;

import java.io.*;   // 입력/출력 관련 클래스 (데이터 읽고 쓰기)
import java.net.*;  // 네트워크 관련 클래스 (소켓, 서버소켓)
import java.util.*; // 자료구조(List 등)

public class Server {

    public static ServerSocket serverSocket;

    // 현재 접속 중인 클라이언트 소켓들을 저장하는 리스트
    // 여러 스레드가 동시에 접근해도 안전하게 하기 위해 synchronizedList 사용
    private static List<Socket> list = Collections.synchronizedList(new ArrayList<>());

    // 현재 접속한 사람들의 닉네임을 저장하는 리스트
    private static List<String> nicknames = Collections.synchronizedList(new ArrayList<>());

    // 각 클라이언트에게 메시지를 보내는 PrintWriter 저장하는 리스트
    private static List<PrintWriter> writers = Collections.synchronizedList(new ArrayList<>());

    public static void main(String[] args) {
        startServer();

        //프로그램이 끝날 때 자동으로 stopServer() 실행되도록 설정
        Runtime.getRuntime().addShutdownHook(new Thread() {
            @Override
            public void run() {
                stopServer();
            }
        });
    }

    public static void startServer() {
        // 서버를 별도의 스레드에서 실행 (메인 프로그램이 멈추지 않도록 하기 위함)
        Thread thread = new Thread() {
            @Override
            public void run() {
                try {
                    // 포트번호 5000을 연결해서 서버 시작
                    serverSocket = new ServerSocket(5000);
                    System.out.println("서버 시작");

                    while (true) {
                        // 클라이언트가 접속을 요청하면 수락
                        Socket socket = serverSocket.accept();
                        System.out.println("클라이언트 접속: " + socket.getInetAddress());

                        // 접속한 클라이언트 소켓을 리스트에 추가
                        list.add(socket);

                        // 클라이언트 전용 스레드를 만들어서 시작
                        new ChatThread(socket).start();
                    }

                } catch (IOException e) {
                    System.out.println("[서버 종료됨]");
                }
            }
        };
        thread.start();
    }

    public static void stopServer() {
        try {
            // 현재 접속 중인 모든 클라이언트 연결 끊기
            for (Socket s : list)
                s.close();

            // 서버 소켓이 열려 있다면 닫기      소켓이 닫힌 상태가 아닌지
            if (serverSocket != null && !serverSocket.isClosed())
                serverSocket.close();

            System.out.println("[서버종료]");

        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    static class ChatThread extends Thread {
        Socket socket;
        String nickname;

        // 생성자 (클라이언트 소켓을 받아옴)
        ChatThread(Socket socket) {
            this.socket = socket;
        }

        // 스레드 실행 내용 (클라이언트와 메시지 주고받기)
        public void run() {
            try {
                // 입력 스트림: 클라이언트가 보낸 메시지를 읽음
                BufferedReader in = new BufferedReader(
                        new InputStreamReader(socket.getInputStream(), "MS949"));
                PrintWriter out = new PrintWriter(new OutputStreamWriter(socket.getOutputStream(), "MS949"), true);
                writers.add(out);


                out.println("닉네임 입력 (공백/중복 불가):");
                nickname = in.readLine();

                nickname = nickname.trim(); // 앞뒤 공백 제거
                if (nickname.isEmpty() || nicknames.contains(nickname)) {
                    out.println("ERR 사용 불가 닉네임. 연결 종료.");
                    socket.close();
                    list.remove(socket);
                    return;
                }

                nicknames.add(nickname);
                System.out.println("닉네임 등록: " + nickname);

                // 모든 사람에게 "누가 입장했습니다" 메시지 보내기
                broadcast(nickname + "님이 입장했습니다.");

                // 클라이언트가 보낸 메시지를 계속해서 읽기
                String message;
                while ((message = in.readLine()) != null) {
                    // "/quit" 입력하면 종료
                    if (message.equals("/quit")) {
                        out.println("채팅을 종료합니다."); // 클라이언트에게 종료 메시지 전송
                        break; // while 루프 종료
                    }


                    // "/who" 입력하면 현재 접속자 명단 보여줌 (자기 자신에게만)
                    else if (message.equals("/who"))
                        //String.join = 문자열 여러 개를 하나로 합치면서 중간에 원하는 구분자를 넣는 기능
                        out.println("현재 접속자: " + String.join(", ", nicknames));

                        // 일반 메시지는 전체에게 방송
                    else
                        broadcast(nickname + ": " + message);
                }

            } catch (IOException e) {
                // 클라이언트 연결이 끊겼을 때 실행됨
                System.out.println("클라이언트 연결 종료: " + nickname);

            } finally {
                // 클라이언트 종료 시 정리 작업
                try {
                    list.remove(socket);            // 클라이언트 소켓 목록에서 제거
                    nicknames.remove(nickname);        // 닉네임 목록에서 제거
                    socket.close();                    // 소켓 닫기
                    broadcast(nickname + "님이 퇴장했습니다."); // 다른 사람들에게 알림
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }

        // 전체 클라이언트에게 메시지 보내기
        private void broadcast(String msg) {
            synchronized (writers) { // 여러 스레드가 동시에 list에 접근하지 못하게 잠금
                for (PrintWriter writer : writers) {
                    writer.println(msg);
                }
            }
        }
    }
}