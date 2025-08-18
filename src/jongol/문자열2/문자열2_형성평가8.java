package 문자열2;

import java.util.Scanner;

public class 문자열2_형성평가8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        while (true) {
            String word = sc.nextLine();

            if (word.equals("END")) {
                break;
            }

            StringBuilder reversed = new StringBuilder(word).reverse();
            System.out.println(reversed);
        }
    }
}
