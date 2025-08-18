package 문자열2;

import java.util.Scanner;

public class 문자열2_형성평가2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String[] words = {"flower", "rose", "lily", "daffodil", "azalea"};

        char ch = sc.nextLine().toLowerCase().charAt(0);

        int count = 0;

        for (String word : words) {
            if (word.length() > 2) {
                char c2 = Character.toLowerCase(word.charAt(1));
                char c3 = Character.toLowerCase(word.charAt(2));
                if (c2 == ch || c3 == ch) {
                    System.out.println(word);
                    count++;
                }
            }
        }

        if (count == 0) {
            System.out.println("0");
        } else {
            System.out.println(count);
        }
    }
}
