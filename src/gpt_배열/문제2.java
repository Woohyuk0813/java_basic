package gpt_배열;

import java.util.Scanner;

public class 문제2 {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        //배열의 최댓값 찾기
        int[] array = {8, 3, 12, 5, 7};

        int max = array[0];

        for (int i = 0; i < array.length; i++) {
            if(array[i]>max){
                max = array[i];
            }
        }
        System.out.println(max);
    }
}
