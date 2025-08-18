package jongol.연산자;

import java.util.Scanner;

public class 연산자_자가진단1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        int sum = a + b + c;
        int avg = sum / 3;
        System.out.printf("sum : %d\n",sum);
        System.out.printf("avg : %d",avg);

    }
}
