package gpt_제어문;

import java.util.Scanner;

public class 문제4 {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        //구구단
        System.out.println("단을 입력하세요.");
        int a = sc.nextInt();
        if (a >= 2 && a <= 9) {
            for (int i = 1; i < 10; i++) {
                System.out.printf("%d * %d = %d\n", a, i, a * i);
            }
        }else {
            System.out.println("2~9 사이의 숫자만 입력하세요.");
        }

    }
}
