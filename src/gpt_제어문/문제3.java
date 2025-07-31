package gpt_제어문;

import java.util.Scanner;

public class 문제3 {
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        //1부터 100까지 합 구하기
        int sum = 0;

        for(int i = 1; i<=100; i++){
            sum +=i;
        }
        System.out.printf("1부터 100까지의 합 : %d",sum);

    }
}
