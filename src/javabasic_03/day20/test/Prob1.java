package javabasic_03.day20.test;
// 문제 1: 텍스트 파일에 문자열 저장
//         문자열 "Hello Java!"를 hello.txt에 저장하세요.
import java.io.FileWriter;
import java.io.IOException;

public class Prob1 {

    public static void main(String[] args) throws IOException {

        String text = "Hello Java!";

        FileWriter writer = new FileWriter("C:/temp/hello.txt");
        writer.write(text);
        writer.close();

        System.out.println("hello.txt 파일에 저장 완료");
    }
}