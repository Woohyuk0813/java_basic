package 반복제어문2;

import java.util.Scanner;

public class 반복제어문2_형성평가9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();

        for(int i = 1; i<=number; i++){

            for(int j= 1; j<=number; j++){
                System.out.printf("(%d, %d) ",i,j);
            }
            System.out.println();
        }
    }
}
