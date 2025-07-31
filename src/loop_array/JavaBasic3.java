package loop_array;

import java.util.Scanner;

public class JavaBasic3 {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {

        while (true) {
            int dice1 = (int) (Math.random() * 6) + 1;
            int dice2 = (int) (Math.random() * 6) + 1;
            int sum = dice1 + dice2;

            System.out.printf("%d + %d = %d\n",dice1,dice2,sum);

            if (sum == 5) {
                break;
            }
        }
        System.out.println("두 숫자의 합이 5입니다!");
    }
}
