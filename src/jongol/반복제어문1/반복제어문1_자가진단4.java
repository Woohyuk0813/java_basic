package jongol.반복제어문1;

import java.util.Scanner;

public class 반복제어문1_자가진단4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int sum = 0;
        double avg = 0;
        int count = 0;

        while (true) {
            int a = sc.nextInt();
            count++;
            sum += a;
            if (a >= 100) {
                break;
            }
        }
        avg = (double) sum / count;
        System.out.printf("%d\n", sum);
        System.out.printf("%.1f", avg);

    }
}

