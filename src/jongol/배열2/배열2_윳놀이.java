package 배열2;

import java.util.Scanner;

public class 배열2_윳놀이 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        for (int i = 0; i < 3; i++) {
            int zeroCount = 0;
            for (int j = 0; j < 4; j++) {
                int val = sc.nextInt();
                if (val == 0) zeroCount++;
            }

            switch (zeroCount) {
                case 1:
                    System.out.println("A"); // 도
                    break;
                case 2:
                    System.out.println("B"); // 개
                    break;
                case 3:
                    System.out.println("C"); // 걸
                    break;
                case 4:
                    System.out.println("D"); // 윷
                    break;
                case 0:
                    System.out.println("E"); // 모
                    break;
            }
        }
    }
}
