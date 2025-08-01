package jongol.문자열1;

import java.util.Scanner;

public class 문자열1_형성평가1 {
    static Scanner in = new Scanner(System.in);
    //영문자 2개 입력 받기
    //각각의 아스키코드의 합과 차 구하기
    public static void main(String[] args) {
        char ch1 = in.next().charAt(0);
        char ch2 = in.next().charAt(0);

        int ascii1 =(int)ch1;
        int ascii2 = (int)ch2;

        System.out.print(ascii1 + ascii2+" ");
        System.out.print(Math.abs(ascii1-ascii2));

    }

}
