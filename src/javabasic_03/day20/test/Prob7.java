package javabasic_03.day20.test;

// 문제 7: 파일 크기 출력
//        copy.jpg 파일의 크기를 바이트 단위로 출력하세요.
import java.io.File;

public class Prob7 {

    public static void main(String[] args) {
        File file = new File("C:/temp/test.jpg");

        System.out.println("copy.jpg 파일 크기: " + file.length() + "byte");
    }
}