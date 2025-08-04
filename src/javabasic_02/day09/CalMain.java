package javabasic_02.day09;

public class CalMain {
    public static void main(String[] args) {

        Mycalculator mycalculator1 = new Mycalculator();
        mycalculator1.numbers[0] = 10;
        System.out.println(mycalculator1.numbers[0]);
        mycalculator1.numbers[1] = 20;
        System.out.println(mycalculator1.numbers[1]);
        mycalculator1.adder(mycalculator1.numbers);
    }
}
