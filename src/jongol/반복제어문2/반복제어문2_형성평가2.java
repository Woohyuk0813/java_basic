package 반복제어문2;

import java.util.Scanner;

public class 반복제어문2_형성평가2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();
        int temp1 = 0;
        int temp2 = 0;
        if (num1 > num2) {
            temp1 = num1;
            temp2 = num2;
        } else {
            temp1 = num2;
            temp2 = num1;
        }
        for (int i = temp2; i <= temp1; i++) {
            System.out.printf(i + " ");
        }
    }
}
