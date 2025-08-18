package javabasic_01.day05.whileEx;

public class BreakEx {
    public static void main(String[] args) {


        Outter:
        for (char upper = 'A'; upper <= 'Z'; upper++) {

            for (char lower = 'a'; lower <= 'z'; lower++) {
                System.out.println(upper + " - " + lower);
                if (lower == 'k') {
                    break Outter;
                }
            }
        }
    }
}
