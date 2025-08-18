package javabasic_01.day03;

public class PrintEx {
    public static void main(String[] args) {
        System.out.println("=========실수 표현=========");

        // 정수 7자리 + 소수점 + 소수2자리 . 왼쪽 빈자리 공백 ____123.45
        System.out.printf("%10.2f",123.45);
        System.out.printf("%10.2f",123.456);

        // 정수 7자리 + 소수점 + 소수2자리 . 왼쪽 빈자리 0  0000123.45
        System.out.printf("%010.2f\n",123.45);

        System.out.println("=========문자열 표현=========");

        //문자열은 %s 포멧    abc 출력
        System.out.printf("%s\n","abc");

        //문자열은 %s 포멧    ___abc 출력
        System.out.printf("%6s\n","abc");

    }
}
