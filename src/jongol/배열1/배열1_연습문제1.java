package jongol.배열1;

import java.util.Scanner;

public class 배열1_연습문제1 {
    static Scanner in = new Scanner(System.in);

    public static void main(String[] args) {

        /*array[0] = in.nextInt();
        array[1] = in.nextInt();
        array[2] = in.nextInt();
        array[3] = in.nextInt();
        array[4] = in.nextInt();*/

        int[] array = new int[5];


        for (int i = 0; i < array.length; i++) {
            array[i] = in.nextInt();
        }
        for (int i : array) {
            System.out.print(i + " ");
        }
    }
}