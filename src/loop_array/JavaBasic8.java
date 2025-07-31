package loop_array;

import java.util.Scanner;

public class JavaBasic8 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num1 = 0; // 잔고 변수

        while (true) {
            System.out.print(""" 
                    --------------------------------
                    1.예금 | 2.출금 | 3.잔고 | 4.종료
                    --------------------------------
                    선택> """);

            String input = scanner.nextLine(); // 입력 받기

            switch (input) {
                case "1":
                    System.out.printf("예금액>");
                    int num2 = scanner.nextInt();

                    break;
                case "2":
                    System.out.println("출금액>");
                    break;
                case "3":
                    System.out.println("잔고>");
                    break;
                case "4":
                    System.out.printf("프로그램 종료");
                    return;


            }
        }
    }
}