package 배열2;

public class 배열2_연습문제4 {
    public static void main(String[] args) {
        int[][] array = {
                {3, 5, 4},
                {2, 6, 7},
                {8, 10, 1}
        };
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(array[i][j] + " ");
            }
            System.out.println();
        }
    }
}
