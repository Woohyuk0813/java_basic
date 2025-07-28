package jongol.연산자;

import java.util.Scanner;

public class 연산자_형성평가4 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int a = scanner.nextInt();
        int b = scanner.nextInt();

        System.out.printf("%d ",++a);
        System.out.printf("%d\n",b--);

        System.out.printf("%d ",a);
        System.out.printf("%d",b);
    }
}
