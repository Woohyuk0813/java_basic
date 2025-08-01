package javabasic_01.day05.whileEx;

import java.util.Scanner;

public class WhileEx03 {
    public static void main(String[] args) {
        //키보드에서 "1"을 입력했을 때 속도를 증가, "2"를 입력하면 속도를 감소시키고 "3" 프로그램 종료 - while문을 이용

        //1. 입력기능
        Scanner sc = new Scanner(System.in);
        //2. 속도의 증감을 비교할 변수

        boolean run = true;

        //3. 속도값 조절 변수
        int speed = 0;

        while(run){
            System.out.println("-------------------");
            System.out.println(" 1. 속도 증가  |  2. 속도 감소 | 3. 종료 ");
            System.out.println("-------------------");
            System.out.printf("선택하세요 : ");

            String stringNum = sc.nextLine();

            if(stringNum.equals("1")){
                speed++;
                System.out.println("현재 속도 = " + speed);
            }else if(stringNum.equals("2")){
                speed--;
                System.out.println("현재 속도 = " + speed);
            }else if(stringNum.equals("3")){
                run = false;
                System.out.println("엔진 끄기");
            }
        }
        System.out.println("프로그램 종료");


    }
}
