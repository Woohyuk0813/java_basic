package javabasic_01.day05.ForEx;

public class StarEx03 {
    public static void main(String[] args) {
        for (int i = 1; i <= 4; i++) {
            for (int j = 5; j > 0; j--) {
                if(i<j){
                    System.out.print(" ");
                }else{
                    System.out.print("*");
                }
            }
            System.out.println();
        }
    }
}
//오른쪽 삼각형 별 찍기