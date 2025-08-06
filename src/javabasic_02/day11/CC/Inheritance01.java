package javabasic_02.day11.CC;

public class Inheritance01 extends Calculation {

    void multiplication(int num1, int num2){
        System.out.println("두 수의 곱 : " + num1 * num2);
    }

    public static void main(String[] args) {

        Inheritance01 obj = new Inheritance01();
        obj.addition(10,20);
        obj.subtraction(20,10);
        obj.multiplication(20,10);



    }
}
