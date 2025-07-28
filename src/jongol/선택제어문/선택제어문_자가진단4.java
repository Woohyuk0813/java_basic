package jongol.선택제어문;

import java.util.Scanner;

public class 선택제어문_자가진단4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        float a = sc.nextFloat();
        String b = " ";
        if (a < 50.80) b = "Flyweight";
        else if ((a >= 50.80) && (a < 61.23)) b = "Lightweight";
        else if ((a >= 61.23) && (a < 72.57)) b = "Middleweight";
        else if ((a >= 72.57) && (a < 88.45)) b = "Cruiserweight";
        else if (a > 88.45) b = "Heavyweight";
        System.out.println(b);

    }
}
