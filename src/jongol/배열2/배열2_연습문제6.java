package 배열2;

import java.util.Scanner;

public class 배열2_연습문제6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[][] scores = new int[3][3];
        int[] subjectSum = new int[3];
        int totalSum = 0;


        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                scores[i][j] = sc.nextInt();
                subjectSum[j] += scores[i][j];
            }
        }

        System.out.printf("%7s %1s %1s %1s\n","국어", "영어", "수학", "총점");

        for (int i = 0; i < 3; i++) {
            int studentSum = 0;
            System.out.printf("%2d번", i + 1);
            for (int j = 0; j < 3; j++) {
                System.out.printf("%4d", scores[i][j]);
                studentSum += scores[i][j];
            }
            totalSum += studentSum;
            System.out.printf("%4d\n", studentSum);
        }

        System.out.printf("%-1s", "합계");
        for (int j = 0; j < 3; j++) {
            System.out.printf("%4d", subjectSum[j]);
        }
        System.out.printf("%4d\n", totalSum);
    }
}
