package jongol.배열1;

import java.util.Scanner;

public class 배열1_연습문제3 {
    static Scanner in = new Scanner(System.in);

    //1. 정수 10개를 입력 받아라(같은 타입의 값을 저장 => 배열의 반복문을 통해서 처리하자)
    //2. 출력조건이 정수형 배열에서 세 번째, 다섯 번째, 마지막 값을 차례로 출력
    public static void main(String[] args) {
        int[] array = new int[10];

        for (int i = 0; i < array.length; i++) {
            array[i] = in.nextInt();
        }
        for(int i = 0; i < array.length; i++){

            if(i == 2 || i==4 || i==9){
                System.out.printf("%d ", array[i]);
            }
        }

    }
}
