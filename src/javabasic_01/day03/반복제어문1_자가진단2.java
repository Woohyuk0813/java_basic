package javabasic_01.day03;

import java.util.Scanner;

public class 반복제어문1_자가진단2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int sum = 0;
        for(int i=1;i<=100;i++) {
            int num = sc.nextInt();
            System.out.println(num);
            num = num + 1;
            sum = sum + i;
        }
        System.out.printf("%d", sum);

    }
}

