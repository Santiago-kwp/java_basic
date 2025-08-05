package javabasic_02.day10;

public class Account {

    private final int MIN_BALANCE = 0;
    private final int MAX_BALANCE = 1000000;

    private int balance;
    private String accountNum;
    private String accountOwner;

    // 생성자
    public Account(String accountNum, String accountOwner, int balance) {
        this.accountNum = accountNum;
        this.accountOwner = accountOwner;
        this.balance = balance;
    }

    public void getAccountInfo() {

    }



    public int getBalance() {
        return balance;
    }

    public void setBalance(int balance) {
        if (balance >= MIN_BALANCE && balance <= MAX_BALANCE)
            this.balance = balance;
    }
}
