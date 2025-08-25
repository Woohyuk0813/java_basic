package javabasic_03.day20.test;

import java.io.File;

public class Prob7 {

    public static void main(String[] args) {
        File file = new File("C:/temp/test.jpg");

        System.out.println("copy.jpg 파일 크기: " + file.length() + "byte");
    }
}