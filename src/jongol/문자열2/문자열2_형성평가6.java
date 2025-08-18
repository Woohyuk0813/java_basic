package 문자열2;

import java.util.ArrayList;
import java.util.Scanner;

public class 문자열2_형성평가6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String A = sc.next();
        String B = sc.next();
        int n = sc.nextInt();

        A = A + B;

        String prefix = A.substring(0, n);

        String suffix = "";
        if (n < B.length()) {
            suffix = B.substring(n);
        }

        B = prefix + suffix;

        // 출력
        System.out.println(A);
        System.out.println(B);
    }
}