package asdf;

import java.sql.SQLOutput;
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
                    *****************************************************
                    """);
            System.out.print("메뉴 번호를 선택해주세요.");
            int menu = sc.nextInt();
            switch (menu) {
                case 1:
                    System.out.println("현재 고객 정보 : ");
                    System.out.printf("이름 %s\t 연락처 %s\n", name, number);
                    break;
                case 2:
                    //System.out.println("2. 장바구니 상품 목록 보기");
                    menuCartItemList();

                case 3:
                    //System.out.println("3. 장바구니 비우기");
                    menuCartClear();
                case 4:
                    //System.out.println("4. 장바구니에 항목 추가하기");
                    menuCartAddItem();
                case 5:
                    //System.out.println("5. 장바구니의 항목 수량 줄이기");
                    menuCartRemoveItemCount();
                case 6:
                   // System.out.println("6. 장바구니의 항목 삭제하기");
                    menuCartRemoveItem();
                case 7:
                    //System.out.println("7. 영수증 표시하기");
                    menuCartBill();
                case 8:
                    menuExit();
                    run = false;
                    break;
                default:
                    System.out.println("-------고객의 장바구니 목록--------");

            }
        }
        System.out.println("종료");


    }

    public static void menuIntroduction() {

    }

    public static void menuGuestInfo(String name, int mobile){

    }
    public static void menuCartItemList(){
        System.out.println("2. 장바구니 상품 목록 보기");
    }
    public static void menuCartClear(){
        System.out.println("3. 장바구니 비우기");
    }
    public static void menuCartAddItem(){
        System.out.println("4. 장바구니에 항목 추가하기");
    }
    public static void menuCartRemoveItemCount(){
        System.out.println("5. 장바구니의 항목 수량 줄이기");
    }
    public static void menuCartRemoveItem(){
        System.out.println("6. 장바구니의 항목 삭제하기");
    }
    public static void menuCartBill(){
        System.out.println("7. 영수증 표시하기");
    }
    public static void menuExit(){
        System.out.println("8. 종료");
    }
}
