package javabasic_02.day09;

public class Mycalculator {
    int[] numbers = new int[2]; // 수를 저장하는 정수형 배열

    public void adder(int[] numbers){
        int n1 = numbers[0];
        int n2 = numbers[1];
        System.out.println(numbers[0] + numbers[1]);
    }
}
