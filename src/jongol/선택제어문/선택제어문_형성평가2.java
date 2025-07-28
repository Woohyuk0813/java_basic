package jongol.선택제어문;

import java.util.Scanner;

public class 선택제어문_형성평가2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();

        if(a==0){
            System.out.println("zero");
        }else if(a>0){
            System.out.println("plus");
        }else if(a<0){
            System.out.println("minus");
        }
    }
}
