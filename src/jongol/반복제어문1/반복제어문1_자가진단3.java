package jongol.반복제어문1;

import java.util.Scanner;

public class 반복제어문1_자가진단3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.printf("number? ");
            int a = sc.nextInt();
            if (a > 0) {
                System.out.println("positive integer");
            } else if (a < 0) {
                System.out.println("negative number");
            } else {
                System.out.println();
                break;

            }
        }
    }
}
