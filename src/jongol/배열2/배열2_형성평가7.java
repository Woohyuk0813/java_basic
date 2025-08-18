package 배열2;

import java.util.Scanner;

public class 배열2_형성평가7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[][] first = new int[2][3];
        int[][] second = new int[2][3];
        int[][] result = new int[2][3];

        System.out.println("first array");
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 3; j++) {
                first[i][j] = sc.nextInt();
            }
        }

        System.out.println("second array");
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 3; j++) {
                second[i][j] = sc.nextInt();
            }
        }

        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 3; j++) {
                result[i][j] = first[i][j] * second[i][j];
            }
        }

        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(result[i][j] + " ");
            }
            System.out.println();
        }
    }
}