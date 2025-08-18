package 문자열2;

import java.util.Arrays;
import java.util.Scanner;

public class 문자열2_형성평가9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String a = sc.next();
        String b = sc.next();
        String c = sc.next();

        double d = Double.parseDouble(b);
        String bFormatted = String.format("%.2f", d);

        System.out.println(a + bFormatted);

        int index = b.indexOf('.');
        char secondDecimal = '0';
        if (index != -1 && index + 2 < b.length()) {
            secondDecimal = b.charAt(index + 2);
        }

        System.out.println("" + secondDecimal + c);
    }
}

