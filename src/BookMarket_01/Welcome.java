package BookMarket_01;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class Welcome {
    static final int NUM_BOOK = 3; //책 권수
    static final int NUM_ITEM = 7; // 1권 당 세부정보
    static CartItem[] mCartItem = new CartItem[NUM_BOOK]; // 장바구니
    static int mCartCount = 0; // 장바구니에 담긴 책 수 체크
    static User User; // 사용자 정보 저장소

    public static void main(String[] args) {
        String[][] mBook = new String[NUM_BOOK][NUM_ITEM];

        Scanner input = new Scanner(System.in);
        System.out.print("당신의 이름을 입력하세요 : ");
        String userName = input.next();

        System.out.print("연락처를 입력하세요 : ");
        int userMobile = input.nextInt();

        User = new User(userName, userMobile);

        String greeting = "Welcome to Shopping Mall";
        String tagline = "Welcome to Book Market!";

        boolean quit = false;
        while (!quit) {
            System.out.println("***********************************************");
            System.out.println("\t" + greeting);
            System.out.println("\t" + tagline);

            menuIntroduction();

            System.out.print("메뉴 번호를 선택해주세요 ");
            int n = input.nextInt();

            if (n < 1 || n > 9) {
                System.out.println("1부터 9까지의 숫자를 입력하세요.");
            } else {
                switch (n) {

                    case 1:
                        menuGuestInfo(userName, userMobile);
                        break;
                    case 2:
                        menuCartItemList();
                        break;
                    case 3:
                        menuCartClear();
                        break;
                    case 4:
                        menuCartAddItem(mBook);
                        break;
                    case 5:
                        menuCartRemoveItemCount();
                        break;
                    case 6:
                        menuCartRemoveItem();
                        break;
                    case 7:
                        printBill();
                        break;
                    case 8:
                        menuExit();
                        quit = true;
                        break;
                    case 9:
                        menuAdminLogin();
                        break;
                }
            }
        }

    }

    public static void menuIntroduction() {
        System.out.println("******************************");
        System.out.println(" 1. 고객 정보 확인하기 \t\t4. 바구니에 항목 추가하기");
        System.out.println(" 2. 장바구니 상품 목록 보기 \t5. 장바구니의 항목 수량 줄이기");
        System.out.println(" 3. 장바구니 비우기 \t\t6. 장바구니의 항목 삭제하기");
        System.out.println(" 7. 영수증 표시하기 \t\t8. 종료");
        System.out.println(" 9. 관리자 로그인");
        System.out.println("******************************");
    }

    // 고객정보 확인하기
    public static void menuGuestInfo(String name, int mobile) {
        System.out.println("현재 고객 정보 : ");
        System.out.println("이름 : " + User.getName() + "   연락처 : " + User.getPhone());
    }

    // 장바구니 상품 목록 보기
    public static void menuCartItemList() {
        System.out.println("장바구니 상품 목록 :");
        System.out.println("---------------------------------------");
        System.out.println("    도서ID \t|     수량 \t|      합계");
        for (int i = 0; i < mCartCount; i++) {
            System.out.print("    " + mCartItem[i].getBookID() + " \t| ");
            System.out.print("    " + mCartItem[i].getQuantity() + " \t| ");
            System.out.print("    " + mCartItem[i].getTotalPrice());
            System.out.println("  ");
        }
        System.out.println("---------------------------------------");
    }

    // 장바구니 비우기
    public static void menuCartClear() {
        if (mCartCount == 0) {
            System.out.println("장바구니에 항목이 없습니다");
        } else {
            System.out.println("장바구니의 모든 항목을 삭제하겠습니까? Y | N ");
            Scanner input = new Scanner(System.in);
            String str = input.nextLine();

            if (str.toUpperCase().equals("Y")) {
                System.out.println("장바구니의 모든 항목을 삭제했습니다");
                for (int i = 0; i < mCartCount; i++) {
                    mCartItem[i] = null;
                }
                mCartCount = 0;
            }
        }
    }

    // 바구니에 항목 추가하기
    public static void menuCartAddItem(String[][] book) {
        BookList(book);

        for (int i = 0; i < NUM_BOOK; i++) {
            for (int j = 0; j < NUM_ITEM; j++)
                System.out.print(book[i][j] + " | ");
            System.out.println("");
        }
        boolean quit = false;

        while (!quit) {

            System.out.print("장바구니에 추가할 도서의 ID를 입력하세요 :");

            Scanner input = new Scanner(System.in);
            String str = input.nextLine();

            boolean flag = false;
            int numId = -1;

            for (int i = 0; i < NUM_BOOK; i++) {
                if (str.equals(book[i][0])) {
                    numId = i;
                    flag = true;
                    break;
                }
            }

            if (flag) {
                System.out.println("장바구니에 추가하겠습니까? Y | N ");
                str = input.nextLine();

                if (str.toUpperCase().equals("Y")) {
                    System.out.println(book[numId][0] + " 도서가 장바구니에 추가되었습니다.");

                    if (!isCartInBook(book[numId][0]))
                        mCartItem[mCartCount++] = new CartItem(book[numId]);
                }
                quit = true;
            } else
                System.out.println("다시 입력해 주세요");

        }
    }

    // 장바구니의 항목 수량 줄이기
    public static void menuCartRemoveItemCount() {
        if (mCartCount == 0) {
            System.out.println("장바구니에 항목이 없습니다");
        } else {
            menuCartItemList();
            boolean quit = false;
            Scanner input = new Scanner(System.in);
            System.out.print("장바구니에서 수량을 줄일 도서의 ID를 입력하세요 : ");
            String str = input.nextLine();
            int numId = -1;
            for (int i = 0; i < mCartCount; i++) {
                if (str.equals(mCartItem[i].getBookID())) {
                    numId = i;
                    quit = true;
                    break;
                }
            }
            if (quit) {
                if (mCartItem[numId].getQuantity() == 1) {
                    mCartItem[numId] = mCartItem[--mCartCount];
                    mCartItem[mCartCount] = null;
                    System.out.println("도서의 수량을 줄였습니다. (수량 0이라 삭제됨)");
                } else {
                    mCartItem[numId].setQuantity(mCartItem[numId].getQuantity() - 1);
                    System.out.println("도서의 수량을 줄였습니다.");
                }
            } else {
                System.out.println("다시 시도해 주세요");
            }
        }
    }

    // 장바구니의 항목 삭제하기
    public static void menuCartRemoveItem() {
        if (mCartCount == 0) {
            System.out.println("장바구니에 항목이 없습니다");
        } else {
            menuCartItemList();
            boolean quit = false;
            Scanner input = new Scanner(System.in);
            System.out.print("장바구니에서 삭제할 도서의 ID를 입력하세요 : ");
            String str = input.nextLine();
            int numId = -1;
            for (int i = 0; i < mCartCount; i++) {
                if (str.equals(mCartItem[i].getBookID())) {
                    numId = i;
                    quit = true;
                    break;
                }
            }
            if (quit) {
                System.out.println("장바구니의 항목을 삭제하겠습니까? Y | N ");
                str = input.nextLine();
                if (str.toUpperCase().equals("Y")) {
                    System.out.println(mCartItem[numId].getBookID() + " 도서가 장바구니에서 삭제되었습니다.");
                    mCartItem[numId] = mCartItem[--mCartCount];
                    mCartItem[mCartCount] = null;
                }
            } else {
                System.out.println("다시 시도해 주세요");
            }
        }
    }

    // 영수증 표시하기
    public static void printBill() {
        Date date = new Date();
        SimpleDateFormat formatter = new SimpleDateFormat("MM/dd/yyyy HH:mm:ss");
        String strDate = formatter.format(date);

        System.out.println();
        System.out.println("---------------영수증-----------------");
        System.out.println("고객명 : " + User.getName() + "\t\t연락처 : " + User.getPhone());
        System.out.println("발송일 : " + strDate);
        System.out.println("---------------------------------------------");
        System.out.println("    도서ID \t|     수량 \t|      합계");
        for (int i = 0; i < mCartCount; i++) {
            System.out.print("    " + mCartItem[i].getBookID() + " \t| ");
            System.out.print("    " + mCartItem[i].getQuantity() + " \t| ");
            System.out.print("    " + mCartItem[i].getTotalPrice());
            System.out.println(" ");
        }
        System.out.println("---------------------------------------------");
        int sum = 0;
        for (int i = 0; i < mCartCount; i++) {
            sum += mCartItem[i].getTotalPrice();
        }
        System.out.println("\t\t\t주문 총금액 : " + sum + "원\n");
        System.out.println("-----------------------------------------------");
        System.out.println();
    }

    // 종료
    public static void menuExit() {
        System.out.println("8. 종료");
    }

    public static void BookList(String[][] book) {

        book[0][0] = "ISBN1234";
        book[0][1] = "쉽게 배우는 JSP 웹 프로그래밍";
        book[0][2] = "27000";
        book[0][3] = "송미영";
        book[0][4] = "단계별로 쇼핑몰을 구현하며 배우는 JSP 웹 프로그래밍 ";
        book[0][5] = "IT전문서";
        book[0][6] = "2018/10/08";

        book[1][0] = "ISBN1235";
        book[1][1] = "안드로이드 프로그래밍";
        book[1][2] = "33000";
        book[1][3] = "우재남";
        book[1][4] = "실습 단계별 명쾌한 멘토링!";
        book[1][5] = "IT전문서";
        book[1][6] = "2022/01/22";

        book[2][0] = "ISBN1236";
        book[2][1] = "스크래치";
        book[2][2] = "22000";
        book[2][3] = "고광일";
        book[2][4] = "컴퓨팅 사고력을 키우는 블록 코딩";
        book[2][5] = "컴퓨터입문";
        book[2][6] = "2019/06/10";
    }

    public static boolean isCartInBook(String bookId) {

        boolean flag = false;
        for (int i = 0; i < mCartCount; i++) {
            if (bookId == mCartItem[i].getBookID()) {
                mCartItem[i].setQuantity(mCartItem[i].getQuantity() + 1);
                flag = true;
            }
        }
        return flag;
    }

    public static void menuAdminLogin() {
        System.out.println("관리자 정보를 입력하세요");

        Scanner input = new Scanner(System.in);
        System.out.print("아이디 : ");
        String adminId = input.next();

        System.out.print("비밀번호 : ");
        String adminPW = input.next();

        Admin admin = new Admin(User.getName(), User.getPhone());
        if (adminId.equals(admin.getId()) && adminPW.equals(admin.getPassword())) {
            System.out.println("이름 " + admin.getName() + "   연락처 " + admin.getPhone());
            System.out.println("아이디 " + admin.getId() + "   비밀번호 " + admin.getPassword());
        } else
            System.out.println("관리자 정보가 일치하지 않습니다.");
    }
}
