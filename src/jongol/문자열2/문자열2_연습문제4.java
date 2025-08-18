package 문자열2;

import java.util.Scanner;

public class 문자열2_연습문제4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String str1 = sc.next();
        String str2 = sc.next();

        if (str1.length() < str2.length()) {
            System.out.println(str1);
            System.out.println(str2);
        } else if (str1.length() > str2.length()) {
            System.out.println(str2);
            System.out.println(str1);
        } else { // 길이가 같은 경우
            System.out.println(str1);
            System.out.println(str2);
        }
    }
}
