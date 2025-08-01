package javabasic_01.day02;

public class BooleanEx {
    public static void main(String[] args) {
        int x = 30;
        boolean result1 = (x == 20);
        boolean result2 = (x != 20);
        boolean result3 = (x > 0 && x < 30);
        boolean result4 = (x < 0 || x >= 30);

        System.out.println(result1);
        System.out.println(result2);
        System.out.println(result3);
        System.out.println(result4);

    }
}
