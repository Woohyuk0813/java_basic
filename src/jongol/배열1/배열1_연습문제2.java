package jongol.배열1;

public class 배열1_연습문제2 {
    public static void main(String[] args) {
        char[] array = new char[26];

        char c = 65;

        for (int i = 0; i < array.length; i++) {
            array[i] = (char)(c + i);
        }
        for (int i = 90; i >= c; i--) {
            System.out.print((char)i + " ");

        }
    }
}


