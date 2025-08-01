package gpt_배열;

import java.util.Scanner;

public class 문제1 {
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        //배열의 총합 구하기
        int[] array = new int[5];
        int sum = 0;
        for (int i = 0; i < 5; i++) {
            array[i] = sc.nextInt();
            sum +=array[i];

        }
        System.out.println(sum);


    }
}
