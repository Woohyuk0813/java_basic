package 문자열2;

import java.util.Scanner;

public class 문자열2_연습문제1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] words = new String[5];

        for (int i = 0; i < 5; i++) {
            words[i] = sc.nextLine();
        }

        for (int i = 0; i < 5; i++) {
            System.out.println(words[i]);
        }
    }
}
