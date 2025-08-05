package javabasic_02.test;

public class Account {
    public static final int MAX_BALANCE = 1000000;
    public static final int MIN_BALANCE = 0;
    private String accountNO;
    private String owner;
    private int balance;

    //은행에서 정보를 등록하는 과정
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
        if ((money > MIN_BALANCE) && (money < MAX_BALANCE))
            this.balance += money;
    }

    public void miusBalance(int money) {
        if ((money < MIN_BALANCE) && (money > MAX_BALANCE))
            this.balance += money;
    }

}
