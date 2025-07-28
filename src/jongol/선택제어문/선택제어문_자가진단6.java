package jongol.선택제어문;

import java.sql.SQLOutput;
import java.util.Scanner;

public class 선택제어문_자가진단6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        char gender = sc.next().charAt(0);
        int age = sc.nextInt();


        if (gender == 'M') {
            if (age >= 18) {
                System.out.println("MAN");
            } else {
                System.out.println("BOY");
            }
        } else if (gender == 'F') {
            if (age >= 18) {
                System.out.println("WOMAN");
            } else {
                System.out.println("GIRL");
            }
        }
    }
}