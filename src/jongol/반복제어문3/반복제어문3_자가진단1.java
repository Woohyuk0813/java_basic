package jongol.반복제어문3;

import java.util.Scanner;

public class 반복제어문3_자가진단1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int sum = 0;
        int count = 0;
        for(int i =1; i <= n; i++) {
            if (i % 2 != 0) {
                if (sum < n) {
                    sum += i;
                    count++;

                }
            }
        }
        System.out.printf("%d %d",count, sum);
    }
}
