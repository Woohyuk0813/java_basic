package jongol.선택제어문;

import java.util.Scanner;

public class 선택제어문_자가진단1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        System.out.printf("%d\n",a);
        if(a<0){
            System.out.printf("minus");
        }
    }
}
