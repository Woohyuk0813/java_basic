package javasocketprogram;

import java.io.*;
import java.net.*;

public class Client {
    public static void main(String[] args) {
        try (Socket socket = new Socket("localhost", 5000);
             BufferedReader in = new BufferedReader(new InputStreamReader(socket.getInputStream(), "UTF-8"));
             PrintWriter out = new PrintWriter(socket.getOutputStream(), true);
             BufferedReader keyboard = new BufferedReader(new InputStreamReader(System.in))) {

            // 서버에서 보내는 메시지 읽는 쓰레드
            new Thread(() -> {
                try {
                    String msg;
                    while ((msg = in.readLine()) != null) {
                        System.out.println(msg);
                    }
                } catch (IOException e) {
                    System.out.println("서버 연결 종료");
                }
            }).start();

            // 키보드 입력 보내기
            String line;
            while ((line = keyboard.readLine()) != null) {
                out.println(line);
                if (line.equalsIgnoreCase("/quit")) break;
            }

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

