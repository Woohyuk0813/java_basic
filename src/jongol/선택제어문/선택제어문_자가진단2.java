package jongol.선택제어문;

import java.util.Scanner;

public class 선택제어문_자가진단2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int cm = sc.nextInt();
        int kg = sc.nextInt();
        int bmi = kg + 100 - cm;
        System.out.println(bmi);

        if (0<bmi)
            System.out.println("Obesity");
    }
}
