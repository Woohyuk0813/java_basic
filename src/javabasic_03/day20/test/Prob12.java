package javabasic_03.day20.test;
//문제 : 10,20,30 을 numbers.dat 파일에 저장하고 다시 읽어 콘솔에 출력하세요
import java.io.*;

public class Prob12 {
    public static void main(String[] args) throws IOException {
    //numbers.dat 파일에 정수 데이터를 써야 하므로 FileOutputStream fos 객체 생성
        FileOutputStream fos = new FileOutputStream("numbers.dat");
    //성능을 높이기 위한 보조 스트림 => DataOutStream()
        DataOutputStream dos = new DataOutputStream(fos);

        dos.writeInt(10);
        dos.writeInt(20);
        dos.writeInt(30);
        dos.flush();
        dos.close();
        FileInputStream fis = new FileInputStream("numbers.dat");
        DataInputStream dis = new DataInputStream(fis);
        System.out.println(dis.readInt());
        System.out.println(dis.readInt());
        System.out.println(dis.readInt());
        dis.close();
    }
}
