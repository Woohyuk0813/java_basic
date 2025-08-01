package jongol.문자열1;

import java.util.Scanner;

public class 문자열1_형성평가2 {
    static Scanner in = new Scanner(System.in);

    public static void main(String[] args) {
        String input = in.nextLine();

        for (int i = 0; i < 5; i++) {
            System.out.print(input.charAt(i));

        }
        System.out.println();
    }
}
