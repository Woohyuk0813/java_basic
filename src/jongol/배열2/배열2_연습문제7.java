package 배열2;

public class 배열2_연습문제7 {
    public static void main(String[] args) {
        int[][] triangle = new int[5][5];

        for (int i = 0; i < 5; i++) {
            triangle[i][0] = 1; //
            for (int j = 1; j <= i; j++) {
                triangle[i][j] = triangle[i - 1][j - 1] + triangle[i - 1][j];
            }
        }

        for (int i = 0; i < 5; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print(triangle[i][j] + " ");
            }
            System.out.println();
        }
    }
}
