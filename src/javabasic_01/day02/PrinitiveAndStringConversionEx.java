package javabasic_01.day02;

public class PrinitiveAndStringConversionEx {
    public static void main(String[] args) {
        String v1 = "10";
        //문자열 "10"을 정수형 10으로 변경시 wrapper클래스를 이용하여 변경한다.
        int d1 = Integer.parseInt(v1);
        System.out.println(d1 + 10);

        v1 = "3.14";
        double d2 = Double.parseDouble(v1);
        System.out.println(d2 + 0.01);

        v1 = "true";
        boolean bool1 = Boolean.parseBoolean(v1);
        System.out.println(v1);

        if(!bool1){  //! 는 not의 의미
            System.out.println("true");
        } else {
            System.out.println("false");
        }
    }
}
