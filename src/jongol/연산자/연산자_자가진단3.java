package jongol.연산자;

import java.util.Scanner;

public class 연산자_자가진단3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        a = a++;
        System.out.printf("%d\n",a++);

        a = ++a;
        System.out.printf("%d\n",a);

    }
}
