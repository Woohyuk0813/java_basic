package 배열2;

import java.util.Scanner;

public class 배열2_형성평가10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char[][] letters = new char[3][5];

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 5; j++) {
                letters[i][j] = sc.next().charAt(0);
            }
        }
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 5; j++) {
                System.out.print(Character.toLowerCase(letters[i][j]) + " ");
            }
            System.out.println();
        }
    }
}