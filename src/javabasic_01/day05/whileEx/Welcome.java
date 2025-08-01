package javabasic_01.day05.whileEx;

import java.util.Scanner;

public class Welcome {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("당신의 이름을 입력하세요 : ");
        String name = sc.nextLine();
        System.out.print("연락처를 입력하세요 : ");
        String number = sc.nextLine();
        boolean run = true;

        while (run) {

            System.out.print("""
                    *****************************************************
                                Welcome to Shopping Mall
                                Welcome to Book Market!
                    *****************************************************
                    1. 고객 정보 확인하기       4. 바구니에 항목 추가하기
                    2. 장바구니 상품 목록 보기   5. 장바구니의 항목 수량 줄이기
                    3. 장바구니 비우기          6. 장바구니의 항목 삭제하기
                    7. 영수증 표시하기          8. 종료
                    *****************************************************ㄱ
                    """);
            System.out.print("메뉴 번호를 선택해주세요.");
            int menu = sc.nextInt();
            switch (menu) {
                case 1:
                    System.out.println("현재 고객 정보 : ");
                    System.out.printf("이름 %s\t 연락처 %s\n", name, number);
                    break;
                case 8:
                    run = false;
                    break;
                default:
                    System.out.println("");

            }
        }
        System.out.println("종료");


    }
}
