package jongol.문자열1;

import java.util.Scanner;

public class 문자열1_연습문제3 {
    static Scanner in = new Scanner(System.in);

    public static void main(String[] args) {
        String str = "jungol olympiad";
        int[] indices = new int[5];

        // 정수 5개 입력 받기
        for (int i = 0; i < 5; i++) {
            int targetNum = in.nextInt();
            if (targetNum > 14 || targetNum < 0) {
                break;
            }
            System.out.print(str.charAt(targetNum));
        }
    }
}


