package 문자열2;

import java.text.DecimalFormat;
import java.util.Scanner;

public class 문자열2_연습문제10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String intStr1 = sc.next();
        String intStr2 = sc.next();

        int int1 = Integer.parseInt(intStr1);
        int int2 = Integer.parseInt(intStr2);
        int intSum = int1 + int2;

        String doubleStr1 = sc.next();
        String doubleStr2 = sc.next();

        double d1 = Double.parseDouble(doubleStr1);
        double d2 = Double.parseDouble(doubleStr2);
        double dSum = d1 + d2;

        DecimalFormat df = new DecimalFormat("#.00");

        System.out.println(int1 + " + " + int2 + " = " + intSum);
        System.out.println(df.format(d1) + " + " + df.format(d2) + " = " + df.format(dSum));
    }
}

