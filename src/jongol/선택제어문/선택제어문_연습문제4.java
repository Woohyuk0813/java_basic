package 선택제어문;

import java.util.Scanner;

public class 선택제어문_연습문제4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("점수를 입력하세요. ");
        int score = sc.nextInt();
        char grade = 0;

        if((score>=90) && (score <=100)) grade = 'A';
        else if((score>=80) && (score <90)) grade = 'B';
        else if((score>=70) && (score <80)) grade = 'C';
        else if((score>=60) && (score <70)) grade = 'D';
        else if((score>=0) && (score <60)) grade = 'F';
        else System.out.println("0부터 100사이의 숫자를 입력해 주세요. ");

        System.out.println(grade);
    }
}
