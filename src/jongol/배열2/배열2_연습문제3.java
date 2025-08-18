package 배열2;

public class 배열2_연습문제3 {
    public static void main(String[] args) {
        int[] fib = new int[41];

        fib[1] = 1;
        fib[2] = 1;

        // 피보나치 수열 계산
        for (int i = 3; i <= 40; i++) {
            fib[i] = fib[i - 1] + fib[i - 2];
        }

        System.out.println("피보나치 수열 10항 : " + fib[10]);
        System.out.println("피보나치 수열 20항 : " + fib[20]);
        System.out.println("피보나치 수열 30항 : " + fib[30]);
        System.out.println("피보나치 수열 40항 : " + fib[40]);
    }
}
