package jongol.입력;

import java.util.Scanner;

public class 입력_연습문제8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("키를 입력하세요. ");
        int num1 = sc.nextInt();
        System.out.print("몸무게를 입력하세요. ");
        double num2 = sc.nextDouble();
        System.out.print("이름을 입력하세요. ");
        String str = sc.next();
        System.out.printf("키 = %d\n몸무게 = %.1f\n이름 = %s",num1, num2, str);

    }
}
