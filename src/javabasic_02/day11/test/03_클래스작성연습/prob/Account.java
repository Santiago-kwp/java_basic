public class Account {
    private String accNo;
    private int balance;


    public void save(int money) {
        this.balance += money;
        System.out.println(this.accNo+" 계좌에 "+money+"만원이 입금되었습니다.");

    }
    public void deposit(int money) {
        if (money <= this.balance) {
            this.balance -= money;
            System.out.println(this.accNo+" 계좌에 "+money+"만원이 출금되었습니다.");

        }
        else {
            System.out.println("잔액이 부족합니다.");
        }

    }

    public String getAccNo() {
        return accNo;
    }

    public void setAccNo(String accNo) {
        this.accNo = accNo;
        System.out.println(this.accNo+" 계좌가 개설되었습니다.");
    }

    public int getBalance() {
        return balance;
    }

}
