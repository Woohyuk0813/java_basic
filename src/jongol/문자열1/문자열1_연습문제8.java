package jongol.문자열1;

import java.util.Scanner;

import static java.lang.Character.isDigit;
import static java.lang.Character.isUpperCase;

public class 문자열1_연습문제8 {
    static Scanner in = new Scanner(System.in);

    public static void main(String[] args) {
        String inputString = in.nextLine();
        String[] splitArray = inputString.split(" ");
        for (int i = 0; i < splitArray.length; i++) {
            String string = splitArray[i];
            System.out.println(string);

        }
    }
}


