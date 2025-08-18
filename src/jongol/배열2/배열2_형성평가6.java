package 배열2;

import java.util.Scanner;

public class 배열2_형성평가6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);int[][] arr = new int[5][5];

        arr[0][0] = 1;
        arr[0][2] = 1;
        arr[0][4] = 1;

        for (int i = 1; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                int left = (j - 1 >= 0) ? arr[i - 1][j - 1] : 0;
                int right = (j + 1 < 5) ? arr[i - 1][j + 1] : 0;
                arr[i][j] = left + right;
            }
        }

        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }
}


