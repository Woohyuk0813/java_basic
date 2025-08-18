package jongol.반복제어문1;

import java.util.Scanner;

public class 반복제어문1_연습문제5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int sum = 0;
        int count = 0;
        double avg;

        while (true) {
            int a = sc.nextInt();
            if (a % 2 != 0)
                sum += a;
            count++;
            if (a == 0)
                break;
        }
        avg = (double)sum / count;
        System.out.printf("홀수의 합 = %d\n", sum);
        System.out.printf("홀수의 평균 = %f", avg);
    }
}
