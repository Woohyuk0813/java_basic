package javabasic_02.day11.BB;

import javabasic_02.day11.AA.F;

public class Son extends Father{

    void name() {
        System.out.println("나의 이름은 홍길동");
    }

    public static void main(String[] args) {
        Son obj = new Son();
        obj.name();
        obj.fatherName();
        obj.houseAddress();
    }
}
