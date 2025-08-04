package javabasic_02.day09;

public class ComputerMain {
    public static void main(String[] args) {
        //Computer 객체생성
        Computer myCom = new Computer();

        int result = 0;

        result = myCom.totalSum(1,2,3);
        System.out.println(result);

        result = myCom.totalSum(1,2,3,4,5);
        System.out.println(result);

        int[] value = {1,2,3,4,5};
        result = myCom.totalSum(value);

        result = myCom.totalSum(new int[] {1,2,3,4,5,6,7,8,9,10});
        System.out.println(result);


    }
}
