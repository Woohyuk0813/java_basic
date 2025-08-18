package jongol.입력;

import java.util.Scanner;

public class 입력_연습문제7 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("두 수를 입력하시오. ");
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();
        int num3 = num1 + num2;
        int num4 = num1 * num2;
        System.out.printf("%d + %d = %d\n", num1, num2, num3);
        System.out.printf("%d * %d = %d", num1, num2, num4);
    }
}
