package 문자열2;

import java.util.Arrays;
import java.util.Scanner;

public class 문자열2_형성평가4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        sc.nextLine();

        String[] arr = new String[n];

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextLine();
        }

        Arrays.sort(arr);

        for (String s : arr) {
            System.out.println(s);
        }
    }
}
