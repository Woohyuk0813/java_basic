package jongol.반복제어문1;

import java.util.Scanner;

public class 반복제어문1_형성평가5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int base = 0;
        int height = 0;
        double triangle_width = 0.0;
        String answer = "";
        boolean flag = true;
        while(flag){
            base = sc.nextInt();
            height = sc.nextInt();
            triangle_width = ((double)base*height)/2;
            System.out.printf("Base = %d\n",base);
            System.out.printf("Height = %d\n",height);
            System.out.printf("Triangle width = %.1f\n",triangle_width);
            System.out.printf("Continue? ");
            answer = sc.nextLine();
            if(answer.equals("Y") || answer.equals("y")) continue;
            else break;
        }
    }
}
