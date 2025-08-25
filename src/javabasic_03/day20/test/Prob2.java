package javabasic_03.day20.test;

import java.io.FileReader;
import java.io.IOException;

public class Prob2 {

    public static void main(String[] args) throws IOException {
        FileReader reader = new FileReader("C:/temp/hello.txt");
        int ch;
        while ((ch = reader.read()) != -1) {
            System.out.print((char) ch);
        }
        reader.close();
    }
}