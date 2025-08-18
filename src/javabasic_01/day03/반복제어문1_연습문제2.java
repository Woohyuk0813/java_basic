package javabasic_01.day03;

public class 반복제어문1_연습문제2 {
    public static void main(String[] args) {
        int sum = 0;
        int num = 1;
        for(int i=1;i<=10;i++) {
            sum = sum + i;
            num = num+1;
        }
        System.out.printf("1부터 10까지의 합 = %d\n",sum);
        System.out.printf("while문이 끝난 후의 num의 값 = %d",num);

    }
}
