package javabasic_03.day17.Anonymous;

public class Main {
    public static void main(String[] args) {

        int number1 = 10;
        int number2 = 20;

        //Calculator 클래스를 생성하여 계산할 수 있도록 클래스 필드에 값을 전달
        Calculator calculator = new Calculator(number1, number2);

        int reselt = calculator.calculate(new Operate() {
            @Override
            public int operate(int a, int b) {
                return a + b;
            }
        });

        System.out.println(reselt);
    }
}
