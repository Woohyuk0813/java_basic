package gpt_제어문;

import java.util.Scanner;

public class 문제1 {
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        //짝수/홀수 판별
        int a = sc.nextInt();
        if(a%2 == 1){
            System.out.println("홀수입니다.");
        }else{
            System.out.println("짝수입니다.");
        }
    }
}
