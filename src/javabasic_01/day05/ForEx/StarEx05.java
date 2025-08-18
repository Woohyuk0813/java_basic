package javabasic_01.day05.ForEx;

public class StarEx05 {
    public static void main(String[] args) {
        for (int i = 1; i <= 4; i++) {
            for (int j = 1; j <= 5; j++) {
                if(i<j){
                    System.out.printf("*");
                }else{
                    System.out.printf("_");
                }
            }
            System.out.println();
        }
    }
}
//오른쪽 역 삼각형 별 찍기