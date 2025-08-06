package javabasic_02.test;

public class Account {
    public static final int MIN_BALANCE = 0;
    public static final int MAX_BALANCE = 1000000;
    private String accountNO;  //계좌번호
    private String owner;      //소유자
    private int balance;       // 통장 (입추름 내역 및 잔고확인)

    //은행에 가서 계좌개설신청하면 개인정보를 은행에 등록하는 첫과정
    Account(String accountNO, String owner, int balance) {
        this.accountNO = accountNO;
        this.owner = owner;
        this.balance = balance;
    }

    public String getAccountNO() {
        return accountNO;
    }

    public String getOwner() {
        return owner;
    }

    public void addBalance(int money) {
        if ((money > MIN_BALANCE) && (money < MAX_BALANCE)) {
            this.balance += money;
        }
    }
    public void miusBalance(int money) {
        if ((money > MIN_BALANCE) && (money < MAX_BALANCE)) {
            this.balance -= money;
        }
    }

    public int getBalance() {

        return this.balance;
    }
}
