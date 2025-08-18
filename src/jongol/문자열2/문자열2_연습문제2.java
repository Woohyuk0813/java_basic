package 문자열2;

import java.util.Scanner;

public class 문자열2_연습문제2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String sentence = sc.nextLine();

        String[] words = sentence.split(" ");

        for (String word : words) {
            System.out.println(word);
        }
    }
}