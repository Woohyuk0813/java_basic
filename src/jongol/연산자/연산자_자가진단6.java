package 연산자;

import java.util.Scanner;
public class 연산자_자가진단6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int b = sc.nextInt();

        int result1 = (a > b) ? 1:0;
        int result2 = (a < b) ? 1:0;
        int result3 = (a >= b) ? 1:0;
        int result4 = (a <= b) ? 1:0;

        System.out.printf("%d > %d --- %d\n",a,b,result1);
        System.out.printf("%d < %d --- %d\n",a,b,result2);
        System.out.printf("%d >= %d --- %d\n",a,b,result3);
        System.out.printf("%d <= %d --- %d",a,b,result4);
    }
}
