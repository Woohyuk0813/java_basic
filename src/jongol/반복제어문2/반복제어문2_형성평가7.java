package 반복제어문2;

import java.util.Scanner;

public class 반복제어문2_형성평가7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int num = sc.nextInt();

        for(int j=1; j<=10; j++){
            System.out.printf(j*num+" ");
        }
    }
}
