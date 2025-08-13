package javabasic_03.day14.Generic;

import java.util.Scanner;

public class BoxModelMain {
    public static void main(String[] args) {
        // 로켓 프레시 라인 , 철호가 배추, 무, 상, 삼겹살 구매 물품에 박스를 담고 내용 출력
        BoxModel<String> boxModel = new BoxModel<>();
        Scanner sc = new Scanner(System.in);

        System.out.println("구매한 물품 입력 : ( 0: 종료)");

        while (true) {
            String item = sc.nextLine();
            if (item.equals("0"))
                break;
            boxModel.box.add(item);
        }

        System.out.print("장바구니 목록: ");
        for (String s : boxModel.box) {
            System.out.print(s + ", ");
        }

        // 박스 사이즈 라인
    }
}

