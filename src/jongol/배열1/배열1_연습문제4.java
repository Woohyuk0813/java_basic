package jongol.배열1;

import java.util.Scanner;

public class 배열1_연습문제4 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int[] number = new int[100];
        int count = 0;

        while(count < 100){

            number[count] = in.nextInt();;
            if(number[count] == 0) {
                break;
            }
            count++;
        }
        //3. 만약 0이면 입력을 중지하고 짝수번째 입력 값을 차례로 출력
        for (int i = 0; i < count; i++) {
            if(i%2 ==1)
            System.out.printf("%d ",number[i]);

        }
    }
}