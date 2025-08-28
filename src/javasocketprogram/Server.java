package javasocketprogram;

import java.io.*;
import java.net.*;
import java.util.*;

public class Server {
    public static ServerSocket serverSocket;
    private static List<Socket> clients = Collections.synchronizedList(new ArrayList<>());
    private static List<String> nicknames = Collections.synchronizedList(new ArrayList<>());

    public static void main(String[] args) {
        startServer();
        Runtime.getRuntime().addShutdownHook(new Thread() {
            @Override
            public void run() {
                stopServer();
            }
        });
    }

    public static void startServer() {
        Thread thread = new Thread() {
            @Override
            public void run() {
                try {
                    serverSocket = new ServerSocket(5000);
                    System.out.println("서버 시작");

                    while (true) {
                        Socket socket = serverSocket.accept();
                        System.out.println("클라이언트 접속:" + socket.getInetAddress());

                        clients.add(socket);
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
            for (Socket s : clients) s.close();
            if (serverSocket != null && !serverSocket.isClosed()) serverSocket.close();
            System.out.println("[서버종료]");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    static class ChatThread extends Thread {
        Socket socket;
        String nickname;

        ChatThread(Socket socket) {
            this.socket = socket;
        }

        public void run() {
            try {
                BufferedReader in = new BufferedReader(new InputStreamReader(socket.getInputStream(), "UTF-8"));
                PrintWriter out = new PrintWriter(socket.getOutputStream(), true);

                // 닉네임 받기
                out.println("닉네임 입력 (공백/중복 불가):");
                nickname = in.readLine();

                if (nickname == null || nickname.trim().isEmpty() || nicknames.contains(nickname)) {
                    out.println("ERR 사용 불가 닉네임. 연결 종료.");
                    socket.close();
                    clients.remove(socket);
                    return;
                }

                nicknames.add(nickname);
                System.out.println("닉네임 등록: " + nickname);
                broadcast(nickname + "님이 입장했습니다.");

                String message;
                while ((message = in.readLine()) != null) {
                    if (message.equalsIgnoreCase("/quit")) break;
                    else if (message.equalsIgnoreCase("/who")) out.println("현재 접속자: " + String.join(", ", nicknames));
                    else broadcast(nickname + ": " + message);
                }

            } catch (IOException e) {
                System.out.println("클라이언트 연결 종료: " + nickname);
            } finally {
                try {
                    clients.remove(socket);
                    nicknames.remove(nickname);
                    socket.close();
                    broadcast(nickname + "님이 퇴장했습니다.");
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }

        private void broadcast(String msg) {
            synchronized (clients) {
                for (Socket s : clients) {
                    try {
                        PrintWriter pw = new PrintWriter(s.getOutputStream(), true);
                        pw.println(msg);
                    } catch (IOException e) {
                        clients.remove(s);
                    }
                }
            }
        }
    }
}
