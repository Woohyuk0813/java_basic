package 문자열2;

import java.util.ArrayList;
import java.util.Scanner;

public class 문자열2_형성평가3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<String> words = new ArrayList<>();

        while (true) {
            String word = sc.nextLine();
            if (word.equals("0")) {
                break;
            }
            words.add(word);
            if (words.size() >= 50) {
                break;
            }
        }

        System.out.println(words.size());

        for (int i = 0; i < words.size(); i += 2) {
            System.out.println(words.get(i));
        }
    }
}
