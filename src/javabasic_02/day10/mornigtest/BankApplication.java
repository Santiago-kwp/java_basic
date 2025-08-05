package javabasic_02.day10.mornigtest;

import java.util.Scanner;

public class BankApplication {
    static Scanner  in = new Scanner(System.in);
    static Account[] Accounts = new Account[100];
    static int i = 0;
    static boolean run = true;
    // 1. 계좌생성 기능 - private static void createAccount()
    private static void createAccount() {
        System.out.println("--------------------");
        System.out.println("       계좌 생성      ");
        System.out.println("--------------------");
        System.out.print("계좌번호 : ");
        String accountNo = in.nextLine();
        System.out.print("계좌주 : ");
        String accountOwner = in.nextLine();
        System.out.print("초기예금액 : ");
        int balance = Integer.parseInt(in.nextLine());

        // 새로운 계좌 생성
        Account newAccount = new Account(accountNo, accountOwner, balance);
        Accounts[i++] = newAccount;
        System.out.println("결과 : 계좌가 생성되었습니다.");

    }

    // 2. 계좌목록 보기 기능 - private static void accountList()
    private static void accountList() {
        for (Account account : Accounts) {
            if (account != null) System.out.printf("계좌 번호 : %s \t 계좌 주 : %s \t 계좌 잔액 : %d\n", account.getAccountNo(), account.getAccountOwner(), account.getBalance());
            else break;
        }

    }

    // 3. 예금 기능 - private static void deposit()
    private static void deposit() {
        int inputMoney = 0;
        boolean findAccount = false;

        while(!findAccount) {
            System.out.println("계좌번호를 입력하세요 : ");
            String inputAccountNo = in.nextLine();

            try {
                for (Account account : Accounts) {
                    if (account != null && account.getAccountNo().equals(inputAccountNo)) {
                        findAccount = true;
                        System.out.println("예금액을 입력하세요 : ");
                        inputMoney = Integer.parseInt(in.nextLine());
                        account.setBalance(account.getBalance()+inputMoney);
                        break;
                    }
                    if (account == null) break;
                }
                // 올바른 계좌번호를 못찾으면 다시 반복
                if (!findAccount) System.out.println("계좌번호를 잘못 입력하셨습니다.");

            }
            catch(NumberFormatException e) {
                System.out.println("숫자가 아니거나 너무 큰 수가 입력되었습니다.");
            }



        }



    }

    // 4. 출금 기능 - private static void withdraw()
    private static void withdraw() {
        int withdrawMoney = 0;
        boolean findAccount = false;

        while(!findAccount) {
            System.out.println("계좌번호를 입력하세요 : ");
            String inputAccountNo = in.nextLine();

            try {
                for (Account account : Accounts) {
                    if (account != null && account.getAccountNo().equals(inputAccountNo)) {
                        findAccount = true;
                        System.out.println("출금액을 입력하세요 : ");
                        withdrawMoney = Integer.parseInt(in.nextLine());
                        while (withdrawMoney > account.getBalance()) {
                            System.out.printf("출금액이 현재 잔액 %d원 보다 크니 다시 출금액을 입력해주세요. : ",account.getBalance());
                            withdrawMoney = Integer.parseInt(in.nextLine());
                        }
                        account.setBalance(account.getBalance()-withdrawMoney);

                    }
                }
                // 올바른 계좌번호를 못찾으면 다시 반복
                if (!findAccount) System.out.println("계좌번호를 잘못 입력하셨습니다.");
            }
            catch(NumberFormatException e) {
                System.out.println("숫자가 아니거나 너무 큰 수가 입력되었습니다.");
            }
        }

    }

    // 5. 프로그램 종료 기능 - private static void exit()
    private static void exit() {
        System.out.println("프로그램을 종료합니다.");
        run = false;
    }

    // Bank application 시작 - main()

    public static void main(String[] args) {

        while(run) {
            String menu = """
                    ========================================
                    1. 계좌개설 2.계좌목록 3.예금 4.출금 5.종료
                    ========================================
                    """;
            System.out.println(menu);
            System.out.println("선택>");

            int choice = Integer.parseInt(in.nextLine());
            switch (choice) {
                case 1 -> createAccount();
                case 2 -> accountList();
                case 3 -> deposit();
                case 4 -> withdraw();
                case 5 -> exit();
            }
        }

    }
}
