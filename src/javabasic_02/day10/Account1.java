package javabasic_02.day10;

public class Account1 {
    public static final int MIN_BALANCE = 0;
    public static final int MAX_BALANCE = 1000000;
    private int balance; //(입추름 내역 및 잔고확인)


    public void setBalance(int money) {
        if (money < MIN_BALANCE || money > MAX_BALANCE) {
            return;
        }
        this.balance += money;
    }

    public int getBalance() {

        return this.balance;
    }

    public static void main(String[] args) {
        Account1 account = new Account1();

        account.setBalance(10000);
        System.out.println(account.balance);

        account.setBalance(200);
        System.out.println(account.balance);
    }
}
