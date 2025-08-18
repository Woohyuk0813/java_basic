package 선택제어문;

import java.util.Scanner;

public class 선택제어문_연습문제1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int input = sc.nextInt();

        System.out.println(input);
        if(input > 10) System.out.printf("%d보다 큰 수를 입력하셨습니다.",input);
    }
}
