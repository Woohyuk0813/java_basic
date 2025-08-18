package 배열2;

import java.util.Scanner;

public class 배열2_형성평가8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[][] arr = new int[4][2];

        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 2; j++) {
                arr[i][j] = sc.nextInt();
            }
        }
        for (int i = 0; i < 4; i++) {
            int rowSum = 0;
            for (int j = 0; j < 2; j++) {
                rowSum += arr[i][j];
            }
            System.out.print(rowSum / 2 + " ");
        }
        System.out.println();

        for (int j = 0; j < 2; j++) {
            int colSum = 0;
            for (int i = 0; i < 4; i++) {
                colSum += arr[i][j];
            }
            System.out.print(colSum / 4 + " ");
        }
        System.out.println();

        int totalSum = 0;
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 2; j++) {
                totalSum += arr[i][j];
            }
        }
        System.out.println(totalSum / 8);
    }
}

