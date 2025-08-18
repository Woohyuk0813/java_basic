package javabasic_01.day05.ForEx;

import java.util.Scanner;

public class StarEx06 {
    public static void main(String[] args) {
        int row, col; //행, 열 값을 저장할 변수 선언

        Scanner sc = new Scanner(System.in);
        System.out.println("몇 행으로 피라미드를 만들까요?");
        int n = sc.nextInt();

        for (row = 1; row <= n; row++) {

            for (col = row; col < (n - 1); col++) {
                System.out.print(" ");
            }
            for (col = 1; col <= (2 * row - 1); col++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
//피라미드 별 찍기