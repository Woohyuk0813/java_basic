package 문자열2;

import java.util.Scanner;

public class 문자열2_연습문제6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);


        String str1 = sc.next();
        String str2 = sc.next();

        String prefix1 = str1.substring(0, 3);
        String prefix2 = str2.substring(0, 3);

        String result1 = prefix2 + str1.substring(3);
        String result2 = str2 + prefix1;

        System.out.println(result1);
        System.out.println(result2);
    }
}