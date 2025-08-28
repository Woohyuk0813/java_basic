package javabasic_03.day22.socketEx;

import java.io.IOException;
import java.net.Socket;

public class Client {
    public static Socket socket;

    public static void main(String[] args) {
        try {
            socket = new Socket("192.168.50.182", 5000);
            System.out.println("서버 접속 성공");

            socket.close();

        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
