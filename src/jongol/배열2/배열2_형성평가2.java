package 배열2;

import java.util.Scanner;

public class 배열2_형성평가2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] scoreGroups = new int[11];

        while (true) {
            int score = sc.nextInt();
            if (score == 0) break;
            if (score < 0 || score > 100) {
                continue;
            }
            int index = score / 10;
            if (score == 100) index = 10;
            scoreGroups[index]++;
        }
        for (int i = 10; i >= 0; i--) {
            if (scoreGroups[i] > 0) {
                int displayScore = (i == 10) ? 100 : i * 10;
                System.out.println(displayScore + " : " + scoreGroups[i] + " person");
            }
        }

    }
}
