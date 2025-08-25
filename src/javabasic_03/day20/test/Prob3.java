package javabasic_03.day20.test;

import java.io.FileReader;
import java.io.IOException;

public class Prob3 {

    public static void main(String[] args) throws IOException {
        FileReader reader = new FileReader("C:/temp/hello.txt");

        int ch;
        int count = 0;

        while ((ch = reader.read()) != -1) {
            count++;
        }

        reader.close();

        System.out.println("hello.txt 파일의 문자 수: " + count);
    }
}