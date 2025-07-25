package jongol.연산자;

import java.util.Scanner;

public class 연산자_자가진단4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int b = sc.nextInt();
        a = a++;
        b = --b;
        int c = a++ * b;
        System.out.printf("%d %d %d",a,b,c);


    }
}
