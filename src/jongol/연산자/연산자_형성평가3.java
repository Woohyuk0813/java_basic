package jongol.연산자;

import java.util.Scanner;

public class 연산자_형성평가3 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int width = scanner.nextInt();
        int height = scanner.nextInt();

        width = width + 5;
        height = height * 2;

        int area = width * height;


        System.out.println("width = " + width);
        System.out.println("length = " + height);
        System.out.println("area = " + area);
    }
}