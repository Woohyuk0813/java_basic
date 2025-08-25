package javabasic_03.day20.test;

import java.io.FileOutputStream;
import java.io.IOException;

public class Prob4 {

    public static void main(String[] args) throws IOException {

        String text = "ABCDEF";


        FileOutputStream abc = new FileOutputStream("C:/temp/byte_output.txt");
        abc.write(text.getBytes());
        abc.close();

        System.out.println("저장완료");
    }
}