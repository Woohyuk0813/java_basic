package javabasic_02.day09;

import java.util.Scanner;

public class Calculator02 {
    static Scanner in = new Scanner(System.in);

    public static int adder(int n1, int n2){ // 덧셈
        return n1 + n2;
    }

    public static int minus(int n1, int n2){
        return n1 - n2;
    }

    public static int multi(int n1, int n2){
        return n1 * n2;
    }

    public static double div(int n1, int n2){
        double result = (double) n1 / n2;
        System.out.printf("%.1f\n", result);
        return result;
    }



    public static void main(String[] args) {
        choice:
        while(true) {
            System.out.println("===================================\n           사칙연산 계산기           \n===================================\n 1.덧셈  2.뺄셈  3.곱셈  4.나눗셈  5.종료");
            System.out.println("두 수를 차례로 입력하고 수행할 사칙연산의 메뉴 숫자를 입력해 주세요.");
            int n1 = in.nextInt();
            int n2 = in.nextInt();
            int choice = in.nextInt();

            switch (choice){
                case 1:
                    adder(n1,n2);
                    System.out.println(adder(n1,n2));
                    break;
                case 2:
                    minus(n1,n2);
                    System.out.println(minus(n1,n2));
                    break;
                case 3:
                    multi(n1,n2);
                    System.out.println(multi(n1,n2));;
                    break;
                case 4:
                    div(n1,n2);
                    break;
                case 5 :
                    break choice;
                default:
                    System.out.println("1-5번 내에 산택해주세요.");
            }
        }
    }
}
