package jongol.문자열1;

import java.sql.SQLOutput;
import java.util.Scanner;

import static java.lang.Character.isDigit;
import static java.lang.Character.isUpperCase;

public class 문자열1_연습문제9 {
    static Scanner in = new Scanner(System.in);

    public static void main(String[] args) {
        String inputString = in.nextLine();

        int len0fStr = inputString.length();

        for (int i = 1; i <= len0fStr; i++) {
            System.out.println(inputString.substring(i) + inputString.substring(0,i));

        }



    }
}


