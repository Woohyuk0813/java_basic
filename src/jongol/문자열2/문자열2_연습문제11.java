package 문자열2;

import java.text.DecimalFormat;
import java.util.Scanner;

public class 문자열2_연습문제11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double[] nums = new double[3];
        for (int i = 0; i < 3; i++) {
            nums[i] = sc.nextDouble();
        }

        DecimalFormat df = new DecimalFormat("0.00");

        String[] intParts = new String[3];
        String[] fracParts = new String[3];

        for (int i = 0; i < 3; i++) {
            String formatted = df.format(nums[i]); // 예: "123.46"
            String[] parts = formatted.split("\\.");
            intParts[i] = parts[0];
            fracParts[i] = parts[1];
        }

        System.out.println(intParts[0]);
        System.out.println(fracParts[0] + intParts[1]);
        System.out.println(fracParts[1] + intParts[2]);
        System.out.println(fracParts[2]);
    }
}
