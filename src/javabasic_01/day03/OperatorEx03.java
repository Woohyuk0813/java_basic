package javabasic_01.day03;

public class OperatorEx03 {
    public static void main(String[] args) {

        int num1 = 1;
        int result1 = num1 <<3;
        //Math.pow(2,3) => 2의 제곱 =>
        int result2 = num1 * (int) Math.pow(2,3);
        System.out.println("result1:" + result1);
        System.out.println("result2:" + result2);

        int r = 0;
        r += 10;  // r = r + 10;
        System.out.printf("현재 r의 값  %d:", r);
        r -= 5;   // r = r - 5;
        System.out.printf("현재 r의 값  %d:", r);
        r *= 2;   // r = r * 2;
        System.out.printf("현재 r의 값  %d:", r);
        r /= 5;   // r = r / 2;
        System.out.printf("현재 r의 값  %d:", r);
        r %= 2;   // r = r % 5;
        System.out.printf("현재 r의 값  %d:", r);
    }
}
