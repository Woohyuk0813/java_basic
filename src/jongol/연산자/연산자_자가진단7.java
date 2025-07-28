package jongol.연산자;

import java.util.Scanner;

public class 연산자_자가진단7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int a = scanner.nextInt();
        int b = scanner.nextInt();

        boolean result3 = (a != 0);
        boolean result4 = (b != 0);

        boolean result5 = result3 && result4;
        boolean result6 = result3 || result4;

        System.out.printf("[JAVA]\n");
        System.out.printf("%s %s",result5,result6);
    }
}
