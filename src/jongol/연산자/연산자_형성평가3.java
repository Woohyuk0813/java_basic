package jongol.연산자;

import java.util.Scanner;

public class 연산자_형성평가3 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        // 사용자 입력 받기
        System.out.print("가로 길이를 입력하세요: ");
        int width = scanner.nextInt();

        System.out.print("세로 길이를 입력하세요: ");
        int height = scanner.nextInt();

        // 가공
        width = width + 5;       // 가로 5 증가
        height = height * 2;     // 세로 2배

        int area = width * height;  // 넓이 계산

        // 결과 출력
        System.out.println("가로 길이: " + width);
        System.out.println("세로 길이: " + height);
        System.out.println("넓이: " + area);
    }
}