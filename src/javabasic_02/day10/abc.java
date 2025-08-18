package javabasic_02.day10;

public class abc {
    public static void main(String[] args) {

        int[] array = {1, 5, 3, 8, 2};
        int max = 0;

        for (int i = 0; i < array.length; i++) {
            if(array[i] > max){
                max = array[i];

            }

        }
        System.out.printf("배열의 최대값은 %d이다.",max);

    }
}
