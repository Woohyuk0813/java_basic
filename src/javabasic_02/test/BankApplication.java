package javabasic_02.test;

import java.util.Scanner;

public class BankApplication {
    static Scanner in = new Scanner(System.in);
    static Account[] accountArray = new Account[100];
    static int count = 0;

    //1. 계좌생성 기능 - private static void createAccount()
    private static void createAccount() {
        System.out.println("--------------");
        System.out.println("    계좌생성    ");
        System.out.println("--------------");
        System.out.println("계좌번호: ");
        String accountNo = in.nextLine();
        System.out.println("계좌주: ");
        String owner = in.nextLine();
        System.out.println("초기입금액: ");   //계산을 위한 정수로 형변환
        int balance = Integer.parseInt(in.nextLine());
        //새로운 계좌 생성
        Account newAccount = new Account(accountNo, owner, balance);
        accountArray[count] = newAccount;
        count++;
        System.out.println("결과: 계좌가 생성되었습니다.");
    }

    //2. 계좌 목록 보기 기능 - private static void accountList()
    private static void Accountlist() {
        System.out.println("---------------");
        System.out.println("    계좌목록     ");
        System.out.println("---------------");
        for (int i = 0; i < count; i++) {
            System.out.printf("%s   %s   %d\n", accountArray[i].getAccountNO(), accountArray[i].getOwner(), accountArray[i].getBalance());
        }
        System.out.println();

    }

    //3. 예금 기능 - private static void deposit()
    private static void deposit() {
        System.out.println("---------------");
        System.out.println("     예금       ");
        System.out.println("---------------");
        System.out.println("계좌번호: ");
        String accountNO = in.nextLine();
        System.out.println("예금액: ");
        int balance = Integer.parseInt(in.nextLine());
        if (balance <= 0) {
            System.out.println("예금액은 0보다 큰 금액이어야 합니다.");
            return;
        }
        for (int i = 0; i < count; i++) {
            if (accountNO.equals(accountArray[i].getAccountNO())) {
                accountArray[i].addBalance(balance);
            }
        }
        System.out.println("예금이 성공되었습니다.");
    }

    //4. 출금 - private static void withdraw()
    private static void withdraw() {
        System.out.println("---------------");
        System.out.println("     출금       ");
        System.out.println("---------------");
        System.out.println("계좌번호: ");
        String accountNO = in.nextLine();
        System.out.println("출금액: ");
        int balance = Integer.parseInt(in.nextLine());
        if (balance >= 0) {
            System.out.println("출금액은 0보다 큰 금액이어야 합니다.");
            return;
        }

        for (int i = 0; i < count; i++) {
            if (accountNO.equals(accountArray[i].getAccountNO())) {
                accountArray[i].miusBalance(balance);

            }
        }
        System.out.println("출금이 성공되었습니다.");


    }

    //5. 프로그램 종료 기능 - private static void exitApp()
    private static void exitApp(){
        System.out.println("프로그램 종료");
        System.exit(0);
        }

    //Bank application 시작 - main()
    public static void main(String[] args) {
        boolean run = true;
        while (run) {
            String menu = """
                    ======================================
                    1.계좌생성 2.계좌목록 3.예금 4.출금 5.종료
                    ======================================
                    
                    """;
            System.out.println(menu);
            System.out.print("<선택> ");

            int choice = Integer.parseInt(in.nextLine());
            switch (choice) {
                case 1 -> createAccount();
                case 2 -> Accountlist();
                case 3 -> deposit();
                case 4 -> withdraw();
                case 5 -> exitApp();
            }

        }
    }
}
