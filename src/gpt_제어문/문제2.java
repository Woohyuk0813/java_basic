package gpt_제어문;

import java.util.Scanner;

public class 문제2 {
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        //학점 출력

        int grade = sc.nextInt();
        switch (grade/10){
            case 10:
            case 9:
                System.out.println("A");
                break;
            case 8:
                System.out.println("B");
                break;
            case 7:
                System.out.println("C");
                break;
            case 6:
                System.out.println("D");
                break;
            default:
                System.out.println("F");

        }
    }
}
