package javabasic_02.test.loop_array;

import java.util.InputMismatchException;
import java.util.Scanner;


public class javaBasic8usingClass {


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Account myAccount = null;   // 계좌 객체 초기화

        // 1. 계좌 생성 (초기 단계)
        int initialBal = 0;
        boolean validInput = false;

        while(!validInput) {
            System.out.println("초기 잔액을 입력하세요: ");
            try {
                initialBal = sc.nextInt();
                sc.nextLine(); // 버퍼 비우기
                myAccount = new Account(initialBal);
                validInput = true;
            } catch (InputMismatchException e) {
                System.out.println("잘못된 입력입니다. 숫자를 입력해주세요.");
            } catch (IllegalArgumentException e) {
                System.out.println("계좌 생성 오류: " + e.getMessage());
            }
        }

        // 2. 계좌 사용 및 로직 실행
        int choice = 0;

        do {
            showButtons();

            try {
                choice = Integer.parseInt(sc.nextLine());
                System.out.println("choice: "+ choice);
                // 입력된 숫자가 1부터 4 사이인지 확인
                if (choice < 1 | choice > 4) {
                    System.out.println("잘못된 입력입니다. 1부터 4까지의 숫자를 입력해주세요.");
                    choice = 0;
                }

                switch (choice) {

                    case 1:
                        System.out.print("예금할 금액을 입력하세요: ");
                        int depositAmount = sc.nextInt();
                        sc.nextLine(); // 버퍼 비우기
                        myAccount.deposit(depositAmount);
                        break;
                    case 2:
                        System.out.print("출금할 금액을 입력하세요: ");
                        int withdrawAmount = sc.nextInt();
                        sc.nextLine(); // 버퍼 비우기
                        try {
                            myAccount.withdraw(withdrawAmount);
                        } catch (InsufficientBalanceException e) {
                            System.out.printf("오류: %s (현재 잔액: %d원, 요청 금액: %d원)\n",
                                    e.getMessage(), e.getCurrentBalance(), e.getRequestedAmount());
                        } catch (IllegalArgumentException e) {
                            System.out.println("오류: " + e.getMessage());
                        }
                        break;
                    case 3:
                        System.out.printf("현재 잔고: %d원\n", myAccount.getBalance());
                        break;
                    case 4:
                        System.out.println("프로그램을 종료합니다.");
                        break;
                }

            } catch (NumberFormatException e) {
                // 숫자로 변환할 수 없는 문자열이 입력되었을 때
                System.out.println("잘못된 형식의 입력입니다. 숫자를 입력해주세요.");
            }

        } while (choice != 4);

    }

    public static void showButtons() {
        System.out.println("""
                -----------------------------------
                1. 예금 | 2. 출금 | 3. 잔고 | 4. 종료
                ----------------------------------- 
                선택> 
                """);
    }

}
