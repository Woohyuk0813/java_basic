package gpt_제어문;

import java.util.Scanner;

public class 문제7 {
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {

        System.out.printf("입력: ");
        int count = sc.nextInt();
        System.out.printf("입력할 숫자 %d개: ",count);
        int a = sc.nextInt();

        int sum = 0;
        for(int i =0;i<count;i++){
            sum+=i;
        }
        System.out.printf("출력: 총합 = %d ",sum);


    }
}
