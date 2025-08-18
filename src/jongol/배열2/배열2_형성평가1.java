package 배열2;

import java.util.Scanner;

public class 배열2_형성평가1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] counts = new int[7];

        for (int i = 0; i < 10; i++) {
            int num = sc.nextInt();
            if (num >= 1 && num <= 6) {
                counts[num]++;
            } else {
                System.out.println("1~6 사이 숫자만 입력하세요.");
                i--;
            }
        }
        for (int i = 1; i <= 6; i++) {
            System.out.println(i + " : " + counts[i]);
        }
    }
}
