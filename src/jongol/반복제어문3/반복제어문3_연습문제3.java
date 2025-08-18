package jongol.반복제어문3;

public class 반복제어문3_연습문제3 {
    public static void main(String[] args) {
        for (int i = 1; i <= 6; i++) {
            int a;
            if (i <= 3) {
                a = i;
            } else {
                a = 6 - i + 1;
            }
            for (int j = 1; j <= a; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}


