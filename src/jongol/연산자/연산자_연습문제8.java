package jongol.연산자;

public class 연산자_연습문제8 {
    public static void main(String[] args) {

        int a = 0;
        int b = 1;
        int c = 2;

        int result1 = (a != b) ? 1:0;
        int result2 = (b != c) ? 1:0;
        int result3 = (a == c) ? 1:0;
        int result4 = (a != c) ? 1:0;

        System.out.printf("%d %d %d %d", result1,result2,result3,result4);



    }
}
