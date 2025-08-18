package 배열2;

import java.util.Scanner;

public class 배열2_형성평가5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[][] jegi = new int[4][3];

        for (int i = 0; i < 4; i++) {
            System.out.print((i+1) + "class? ");
            for (int j = 0; j < 3; j++) {
                jegi[i][j] = sc.nextInt();
            }
        }

        for (int i = 0; i < 4; i++) {
            int sum = 0;
            for (int j = 0; j < 3; j++) {
                sum += jegi[i][j];
            }
            System.out.println((i+1) + "class : " + sum);
        }
    }
}
