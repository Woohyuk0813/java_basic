package 문자열2;

import java.util.Scanner;

public class 문자열2_연습문제7 {
    public static void main(String[] args) {
        String[] words = {
                "champion", "tel", "pencil", "jungol", "olympiad",
                "class", "information", "lesson", "book", "lion"
        };

        Scanner sc = new Scanner(System.in);

        System.out.print("문자를 입력하세요. ");
        char ch = sc.next().charAt(0);

        boolean foundChar = false;
        for (String word : words) {
            if (word.indexOf(ch) != -1) {
                System.out.println(word);
                foundChar = true;
            }
        }
        if (!foundChar) {
            System.out.println("찾는 단어가 없습니다.");
        }

        System.out.print("\n문자열을 입력하세요. ");
        String str = sc.next();

        boolean foundString = false;
        for (String word : words) {
            if (word.contains(str)) {
                System.out.println(word);
                foundString = true;
            }
        }
        if (!foundString) {
            System.out.println("찾는 단어가 없습니다.");
        }
    }
}
