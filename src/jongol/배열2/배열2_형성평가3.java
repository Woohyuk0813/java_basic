package 배열2;

import java.util.Scanner;

public class 배열2_형성평가3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[10];

        int a = sc.nextInt();
        int b = sc.nextInt();

        if (a < 1 || a >= 10 || b < 1 || b >= 10) {
            System.out.println("10 미만의 자연수만 입력하세요.");
            sc.close();
            return;
        }

        arr[0] = a;
        arr[1] = b;

        for (int i = 2; i < 10; i++) {
            int sum = arr[i - 2] + arr[i - 1];
            arr[i] = sum % 10;
        }
        for (int i = 0; i < 10; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
}
