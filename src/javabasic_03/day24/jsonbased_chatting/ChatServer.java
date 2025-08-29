package javabasic_03.day24.jsonbased_chatting;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
//채팅서버 실행클래스가 하는 일에 대해 기술하세요
//클라이언트의 연결 요청을 수락하고 통신용 SocketClient를 생성하는 역할을 한다.
import org.json.*;

public class ChatServer {
    ServerSocket serverSocket;  // 클라이언트의 연결 요청 수락
    ExecutorService threadPool = Executors.newFixedThreadPool(100); //100개의 클라이언트가 동시에 채팅할 수 있도록 운영하기 위해
    Map<String, SocketClient> chatRoom = new ConcurrentHashMap<>(new HashMap<>()); //통신용 SocketClient를 관리하는 동기화된 Map 컬렌션이다.


    //메소드 : 서버 시작 채팅서버가 시작할때 가장 먼저 호출되는 메소드
    //50001번 Port에 바인딩하는 ServerSocket을 생성하고 작업스레드가 처리할 Runnable을 람다식 ()->{....} 제공
    public void start() throws IOException {
        serverSocket = new ServerSocket(50001);
        System.out.println("Server started");

        Thread thread = new Thread(
                () -> {
                    try {
                        while (true) {    //람다식이 하는일을 개발자가 아래와 같이 2가지를 지정함
                            Socket socket = serverSocket.accept();   //1. accept()로 연결을 수락
                            SocketClient client = new SocketClient(this, socket);  //2. 통신용 SocketClient를 반복해서 생성한다.
                        }

                    } catch (Exception e) {
                        e.printStackTrace();
                    }


                }
        );
        thread.start();

    }


    //메소드: 클라이언트 연결 시 SocketClient 생성하고 Map에 추가하는 기능
    public void addSocketClient(SocketClient socketClient) {
        //클라이언트 정보를 이용하여 고유 key생성
        String key = socketClient.chatName + "@" + socketClient.clientIp;
        chatRoom.put(key, socketClient);
        System.out.println("입장 > :" + key);
        System.out.println("현재 채팅자 수: " + chatRoom.size() + "\n");

    }

//메소드: 클라이언트 연결 종료 시 SocketClient 제거

    public void removeSocketClient(SocketClient socketClient) {
        String key = socketClient.chatName + "@" + socketClient.clientIp;
        chatRoom.remove(key);
        System.out.println("퇴장");
        System.out.println("현재 채팅자 수: " + chatRoom.size() + "\n");
    }
    // 메시지 브로드캐스트 기능 : JSON메시지를 생성하여 채팅방에 있는 모든
    // 클라이언트에게 보내는 기능 구현

    public void sendToAll(SocketClient sender, String message) {
        JSONObject root = new JSONObject();
        root.put("clientIp", sender.clientIp);
        root.put("chatName", sender.chatName);
        root.put("message", message);
        String json = root.toString();

        //Collections<SocketClient> 얻은 후 모든 SocketClient로 하여금
        //send()로 JSON메세지를 보내게 한다.
        Collection<SocketClient> clients = chatRoom.values();
        for(SocketClient client : clients) {
            if(client == sender) continue;
            client.send(json);
        }
    }

    //서버종료 : stop()
    public void stop(){
        try {
            serverSocket.close();
            threadPool.shutdown();
            chatRoom.clear();
            System.out.println();
            System.out.println("서버 종료");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}