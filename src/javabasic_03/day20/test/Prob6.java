package javabasic_03.day20.test;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class Prob6 {

    public static void main(String[] args) throws IOException {
        FileInputStream a = new FileInputStream("C:/temp/test.jpg");
        FileOutputStream b = new FileOutputStream("C:/temp/testCopy.jpg");

        a.transferTo(b);

        a.close();
        b.close();

        System.out.println("이미지 복사 완료!");
    }
}