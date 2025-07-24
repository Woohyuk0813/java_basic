package jongol.입력;

import java.util.Scanner;

public class 입력_연습문제5 {
    public static void main(String[] args) {
        double x,y;
        x = 1.2340;
        y = 10.3459;
        Scanner sc = new Scanner(System.in);
        System.out.println("전체 7자리로 맞추고 소수 4자리까지 출력");
        System.out.printf("x =  %.4f\n",x);
        System.out.printf("y = %.4f\n",y);

        x = 1.23;
        y = 10.35;
        System.out.println("소수 2자리까지 출력(반올림)");
        System.out.printf("x = %.2f\n",x);
        System.out.printf("y = %.2f\n",y);

    }
}
