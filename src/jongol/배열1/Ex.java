package jongol.배열1;

import java.util.Scanner;

public class Ex {
    static Scanner in = new Scanner(System.in);

    public static void main(String[] args) {

        /*array[0] = in.nextInt();
        array[1] = in.nextInt();
        array[2] = in.nextInt();
        array[3] = in.nextInt();
        array[4] = in.nextInt();*/

        int[] array = new int[5];


        System.out.println(("=====itar방식 입력====="));
        for (int i = 0; i < array.length; i++) {
            array[i] = in.nextInt();
        }
        System.out.println(("=====iter방식 출력====="));
        for (int i : array) {
            System.out.println(i);
        }
        System.out.println(("=====itar방식 출력====="));
        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);

        }

    }
}
