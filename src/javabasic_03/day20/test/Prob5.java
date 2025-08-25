package javabasic_03.day20.test;
// 문제 5: 바이트 단위 파일 읽기
//        byte_output.txt 파일을 읽어 화면에 출력하세요.
import java.io.FileInputStream;
import java.io.IOException;

public class Prob5 {

    public static void main(String[] args) throws IOException {
        FileInputStream hi = new FileInputStream("C:/temp/byte_output.txt");

        int b;

        while ((b = hi.read()) != -1) {
            System.out.print((char) b);
        }

        hi.close();
        System.out.println();
    }
}