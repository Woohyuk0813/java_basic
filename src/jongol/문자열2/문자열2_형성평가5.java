package 문자열2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class 문자열2_형성평가5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String[] words = new String[5];
        for (int i = 0; i < 5; i++) {
            words[i] = sc.nextLine();
        }

        char ch = sc.nextLine().charAt(0);

        String str = sc.nextLine();

        ArrayList<String> matchedWords = new ArrayList<>();

        for (String w : words) {
            if (w.indexOf(ch) != -1 || w.contains(str)) {
                matchedWords.add(w);
            }
        }

        if (matchedWords.isEmpty()) {
            System.out.println("none");
        } else {
            for (String w : matchedWords) {
                System.out.println(w);
            }
        }
    }
}
