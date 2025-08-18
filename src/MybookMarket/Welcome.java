package MybookMarket;

import BookMarket_01.CartItem;
import BookMarket_01.User;

import java.util.Scanner;

public class Welcome {
    static final int NUM_BOOK = 3;
    static final int NUM_ITEM = 7;
    static CartItem[] mCartItem = new CartItem[NUM_BOOK];
    static int mCartCount = 0;
    static User mUser;

    public static void main(String[] args) {
        String[][] mBook = new String[NUM_BOOK][NUM_ITEM];

        Scanner input = new Scanner(System.in);
        System.out.println("당신의 이름을 이력하세요 : ");
        String username = input.next();

        System.out.println("연락처를 입력하세요 : ");
        int userMobile = input.nextInt();

        mUser = new User(username, userMobile);

        String greeting = "Welcome to Shopping Mall";
        String tagline = "Welcome to Book Market!";
        boolean quit = false;

        while (!quit) {
            System.out.println("*************************************");
            System.out.println("\t" + greeting);
            System.out.println("\t" + tagline);
        }
    }

}aa
