package javabasic_03.day22.socketEx;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

public class Server {
    public static ServerSocket serverSocket;

    public static void main(String[] args) {
        try {
            serverSocket = new ServerSocket(5000);

            Socket socket = serverSocket.accept();
            System.out.println("서버 접속 성공");

            socket.close();

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}