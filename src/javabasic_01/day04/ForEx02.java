package javabasic_01.day04;

import java.util.Scanner;

public class ForEx02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int result = 0;
        for(int i=1; i <=10; i++){
            result +=i;
        }
        System.out.println("for문을 이용한 합:" + result);
    }
}
