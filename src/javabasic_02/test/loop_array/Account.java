package javabasic_02.test.loop_array;

public class Account {
    private int balance; // 잔고 (속성)

    // 생성자
    public Account(int initialBalance) {
        if (initialBalance < 0) {
            throw new IllegalArgumentException("초기 잔액은 0보다 작을 수 없습니다.");
        }
        this.balance = initialBalance;
    }

    // 행위 (메서드)

    // 1. 잔고 조회 (getter 메서드)
    public int getBalance() {
        return balance;
    }

    // 2. 예금 (deposit)
    public void deposit(int inputCash) {
        if (inputCash <=0) {
            throw new IllegalArgumentException("예금액은 0보다 커야 합니다.");
        }
        this.balance += inputCash;
    }

    // 3. 출금 (withdraw)
    public void withdraw(int withdrawCash) throws InsufficientBalanceException {
        if (withdrawCash <= 0) {
            throw new IllegalArgumentException("출금액은 0보다 커야 합니다.");
        }
        if (this.balance < withdrawCash) {
            // 잔액 부족 시 사용자 정의 예외를 던짐
            throw new InsufficientBalanceException("출금액이 현재 잔액보다 많습니다.", this.balance, withdrawCash);
        }
        this.balance -= withdrawCash;
    }


}