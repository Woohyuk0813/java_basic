package jongol.반복제어문1;

import java.util.Scanner;

public class 반복제어문1_자가진단2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int sum = 0;

        for(int i = 1; i<=num; i++){
            sum = i+sum;

        }
        System.out.printf("%d",sum);
    }
}
