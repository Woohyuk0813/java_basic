package 선택제어문;

import java.util.Scanner;

public class 선택제어문_연습문제9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();

        int max = (num1 > num2) ? num1 : num2;

        System.out.println("" + max);

      }
}

