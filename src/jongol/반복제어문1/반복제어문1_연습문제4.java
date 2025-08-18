package jongol.반복제어문1;

import java.util.Scanner;

public class 반복제어문1_연습문제4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int count = 0;
        int sum = 0;
        double avg = 0;

        while(true) {
            int a = sc.nextInt();

            if (a == 0)
                break;
            count++;
            sum += a;
        }
        avg = (double)sum/count;
        System.out.printf("입력된 자료의 개수 = %d\n",count);
        System.out.printf("입력된 자료의 합계 = %d\n",sum);
        System.out.printf("입력된 자료의 평균 = %.2f",avg);
        }
    }
