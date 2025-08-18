package javabasic_01.day02;

public class PromotionEx {
    public static void main(String[] args) {

        byte byteValue = 10;
        int intValue = byteValue;

        long longValue = 500000000L;
        float floatValue = longValue;
        double doubleValue = longValue;

        System.out.println(floatValue);
        System.out.println(doubleValue);

        double d1 = 5e2; //5.0 x 10 x 10 = 500.0
        double d2 = 0.12E-2; //0.12 x 0.01
        double d3 = 3.14;
        double d4 = 314e-2;

        System.out.println(d1 + " " + d2 + " " + d3 + " " + d4);

        float f1 = 3.14f;   //float 리터럴 값은 마지막에 f, F를 분힌다
        float f2 =3E6F;
        System.out.println(f1 + " " + f2);
    }

}
