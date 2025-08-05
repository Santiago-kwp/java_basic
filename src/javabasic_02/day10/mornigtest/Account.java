package javabasic_02.day10.mornigtest;

public class Account {
    public static final int MIN_BALANCE = 0;
    public static final int MAX_BALANCE = 1000000;
    private int balance;    // 통장 (입출금 내역 및 잔고 확인)
    private String accountNo; // 계좌번호
    private String accountOwner; // 소유자


    // 은행에 가서 계좌개설 신청을 하면 개인정보를 은행에 등록하는 첫 과정
    public Account(String accountNo, String accountOwner, int balance) {
        this.accountNo = accountNo;
        this.accountOwner = accountOwner;
        this.balance = balance;
    }

    public String getAccountNo() {
        return accountNo;
    }

    public String getAccountOwner() {
        return accountOwner;
    }

    public void setBalance(int money) {

        if (money < MIN_BALANCE || money > MAX_BALANCE) { return; }

        this.balance = money;
    }

    public int getBalance() {
        return this.balance;
    }



}
