package javabasic_03.day20.test;

import java.io.FileWriter;
import java.io.IOException;

public class Prob1 {

    public static void main(String[] args) throws IOException {

        String text = "Hello Java!";

        FileWriter writer = new FileWriter("C:/temp/hello.txt");
        writer.write(text);
        writer.close();

        System.out.println("hello.txt 파일에 저장 완료!");
    }
}