package 선택제어문;

import java.util.Scanner;

public class 선택제어문_연습문제7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("1. 삽입");
        System.out.println("2. 수정");
        System.out.println("3. 삭제");
        System.out.print("숫자를 선택하세요. ");
        int number = sc.nextInt();

        if(number== 1) System.out.print("삽입을 선택하셨습니다.");
        else if(number == 2) System.out.print("수정을 선택하셨습니다.");
        else if(number == 3) System.out.print("삭제를 선택하셨습니다.");
    }
}
