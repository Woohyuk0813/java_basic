package 선택제어문;

import java.util.Scanner;

public class 선택제어문_연습문제2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int input1 = sc.nextInt();
        int input2 = sc.nextInt();

        if(input1 < input2)
            System.out.printf("입력받은 수 중 큰 수는 %d이고 작은 수는 %d입니다.", input2, input1);
    }
}
