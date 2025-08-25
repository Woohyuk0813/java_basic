package javabasic_03.day20.test;

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