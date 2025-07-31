package loop_array;

public class JavaBasic5 {
    public static void main(String[] args) {
        for (int i = 1; i <= 5; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
           //출력 후 줄바꿈
            System.out.println();
        }
    }
}