package jongol.선택제어문;

import java.sql.SQLOutput;
import java.util.Scanner;

public class 선택제어문_자가진단5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        float a = sc.nextFloat();
        float b = sc.nextFloat();

        if(a>=4.0 && b>=4.0){
            System.out.println("A");
        }else if(a>=3.0 && b>=3.0){
            System.out.println("B");
        }else if(a>=2.0 && b>=2.0) {
            System.out.println("C");
        }
    }
}
