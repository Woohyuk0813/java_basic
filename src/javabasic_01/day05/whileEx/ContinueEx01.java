package javabasic_01.day05.whileEx;

public class ContinueEx01 {
    public static void main(String[] args) {
        
        for(int i = 1; i <=10; i++){
            System.out.println("i = " + i);
            if(i % 2 != 0){
                continue;
            }
            System.out.println("결과 출력: " + i);
        }
    }
}
