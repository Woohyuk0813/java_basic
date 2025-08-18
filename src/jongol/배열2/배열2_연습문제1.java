package 배열2;

import java.util.Scanner;

public class 배열2_연습문제1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] counts = new int[11];

        while (true) {
            int num = scanner.nextInt();

            if (num < 1 || num > 10) {
                break;
            }

            counts[num]++;
        }

        for (int i = 1; i <= 10; i++) {
            if (counts[i] > 0) {
                System.out.println(i + " : " + counts[i] + "개");
            }
        }

    }
}
