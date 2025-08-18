package javabasic_01.day03;

public class OperatorEx01 {
    public static void main(String[] args) {
        byte v1 = 10;
        byte v2 = 4;
        int v3 = 5;
        long v4 = 10L;

        int result4 = v1 + v2;
        System.out.println(result4);
        long result5 = v1 + v2 - v4;
        System.out.println(result5);
        double result6 = (double) v1 / v2;
        System.out.println(result6);

        int result7 = v1 % v2;
        System.out.println(result7);

        if (10 % 2 == 0) {
            System.out.println("짝수입니다.");
        } else {
            System.out.println("홀수입니다.");

        }

        int apple = 1;
        int totalpieces = apple * 10;
        int number = 7;

        int result = totalpieces - number;
        System.out.println("10조각에서 남은 조각 : " + result);
        System.out.println("사과 1개에서 남은 양 : " + result);
        int n1 = 10;
        int n2 = 10;

        // n1과 n2의 값이 같은가? 결과를 result1에 저장하여 출력
        boolean result1 = (n1 == n2);
        System.out.println(result1);

        boolean result2 = (n1 != n2);
        System.out.println(result2);

        boolean result3 = (n1 >= n2);
        System.out.println(result3);

        int n3 = 1;
        double n4 = 1.0;
        System.out.println(n3 == n4);
    }
}


