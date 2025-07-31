package gpt_제어문;

import java.util.Scanner;

public class 문제5 {
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        int answer = (int)(Math.random()*100)+1;

        while(true) {
            System.out.printf("숫자를 맞혀보세요:");
            int input = sc.nextInt();

            if (answer==input) {
                System.out.println("정답");
                break;
            } else if (input>answer) {
                System.out.println("Down");
            } else{
                System.out.println("up");
            }
        }
    }
}
