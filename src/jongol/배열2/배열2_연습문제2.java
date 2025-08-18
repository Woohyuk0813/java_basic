package 배열2;

import java.util.Scanner;

public class 배열2_연습문제2 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int[] lastDigitCounts = new int[10];

        while (true) {
            int num = scanner.nextInt();

            if (num == 0) {
                break;
            }

            int lastDigit = Math.abs(num % 10);
            lastDigitCounts[lastDigit]++;
        }

        // 결과 출력
        for (int i = 0; i <= 9; i++) {
            if (lastDigitCounts[i] > 0) {
                System.out.println(i + " : " + lastDigitCounts[i] + "개");
            }
        }

    }
}
