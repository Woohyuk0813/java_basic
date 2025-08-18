package 문자열2;

import java.util.Scanner;

public class 문자열2_연습문제8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // 문자열 입력
        String str1 = sc.next();
        String str2 = sc.next();

        if (str1.compareTo(str2) < 0) {
            System.out.println(str2 + " 가(이) 더 큽니다.");
        } else if (str1.compareTo(str2) > 0) {
            System.out.println(str1 + " 가(이) 더 큽니다.");
        } else {
            System.out.println("두 문자열이 같습니다.");
        }

        boolean same = false;
        if (str1.length() >= 3 && str2.length() >= 3) {
            same = str1.substring(0, 3).equals(str2.substring(0, 3));
        }

        if (same) {
            System.out.println("앞의 세 문자가 같습니다.");
        } else {
            System.out.println("앞의 세 문자가 같지 않습니다.");
        }
    }
}
