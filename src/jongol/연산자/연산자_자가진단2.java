package jongol.연산자;

import java.util.Scanner;

public class 연산자_자가진단2 {
    public static void main(String[] args) {
        Scanner sc =  new Scanner(System.in);
        System.out.println(" ");
        int a = sc.nextInt();
        int b = sc.nextInt();

        a = a+100;
        b = b % 10;
        System.out.printf("%d %d",a,b);
    }
}
