package javasocketprogram;

import java.io.*;
import java.net.*;

public class Client {
    public static void main(String[] args) {
        try (Socket socket = new Socket("localhost", 5000);
             PrintWriter out = new PrintWriter(
                     new OutputStreamWriter(socket.getOutputStream(), "MS949"), true);
             BufferedReader in = new BufferedReader(
                     new InputStreamReader(socket.getInputStream(), "MS949"));
             BufferedReader keyboard = new BufferedReader(new InputStreamReader(System.in))) {

            // 서버에서 보내는 메시지 읽는 쓰레드
            Thread readThread = new Thread(() -> {
                try {
                    String msg;
                    while ((msg = in.readLine()) != null) {
                        System.out.println(msg);
                    }
                } catch (IOException e) {
                    System.out.println("서버 연결 종료");
                }
            });
            readThread.setDaemon(true); // 메인 스레드 종료 시 자동 종료
            readThread.start();

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

