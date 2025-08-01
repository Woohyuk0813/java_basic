package javabasic_01.day05.whileEx;

public class WhileEx02 {
    public static void main(String[] args) {
        //1부터 10까지 출력하는 프로그램 - while문을 이용
        int loop = 1;
        int sum = 0;
        while(loop <= 100){
            sum += loop;
            loop += 1;  //loop++;
        }
        System.out.println(sum);
    }
}
