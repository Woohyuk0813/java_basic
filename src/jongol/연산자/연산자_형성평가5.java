package jongol.연산자;

import java.util.Scanner;

public class 연산자_형성평가5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int msHeight = scanner.nextInt();
        int msWeight = scanner.nextInt();
        int kyHeight = scanner.nextInt();
        int kyWeight = scanner.nextInt();

        boolean result = (msHeight > kyHeight) && (msWeight > kyWeight);

        System.out.println(result ? 1 : 0);
    }
}
