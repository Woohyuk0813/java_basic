package 문자열2;

import java.util.Scanner;

public class 문자열2_형성평가7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String str1 = sc.next();
        String str2 = sc.next();

        int num1 = parseLeadingInt(str1);
        int num2 = parseLeadingInt(str2);

        System.out.println(num1 * num2);
    }

    private static int parseLeadingInt(String s) {
        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (Character.isDigit(c)) {
                sb.append(c);
            } else {
                break;
            }
        }

        if (sb.length() == 0) {
            return 0;
        }

        return Integer.parseInt(sb.toString());
    }
}
