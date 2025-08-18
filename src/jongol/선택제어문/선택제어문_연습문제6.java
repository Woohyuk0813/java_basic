package 선택제어문;

import java.util.Scanner;

public class 선택제어문_연습문제6 {
    public static void main(String[] args) {

        //Math.max()를 이용하여 풀어보세요.
        System.out.printf("세 수를 입력하세요. ");
        Scanner sc = new Scanner(System.in);

        int number1 = sc.nextInt();
        int number2 = sc.nextInt();
        int number3 = sc.nextInt();

        int temp1 = Math.max(number1,number2);
        int temp2 = Math.max(number2,number3);

        int maxValue = Math.max(temp1,temp2);

        System.out.printf("입력받은 수 중 가장 큰 수는 %d입니다.",maxValue);
    }
}
