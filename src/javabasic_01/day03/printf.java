package javabasic_01.day03;

import java.util.Scanner;

public class printf {
    public static void main(String[] args) {
        int price = 5000;
        System.out.printf("상품의 가격: %d원\n",price);

        System.out.printf("상품의 가격: %7d원\n",price);

        System.out.printf("상품의 가격: %07d원\n",price);

        System.out.println("반지름을 입력하세요.");
        Scanner sc = new Scanner(System.in);
        int rad = sc.nextInt();
        System.out.printf("반지름이 %d인 원의 넓이: %.1f",rad,rad*rad*Math.PI);
    }
}
