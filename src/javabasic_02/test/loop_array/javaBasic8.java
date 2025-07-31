package javabasic_02.test.loop_array;

import java.util.Scanner;

public class javaBasic8 {
    static Scanner input = new Scanner(System.in);
    static int deposit;
    static int checkOutCash;

    public static void showButtons() {
        System.out.println("""
                -----------------------------------
                1. 예금 | 2. 출금 | 3. 잔고 | 4. 종료
                ----------------------------------- 
                """);
    }

    public static int isValidInputCheck() {
        int inputNumber = 0;
        boolean isValidInput = false;

        while(!isValidInput) {
            System.out.print("선택> ");
            String userInput = input.nextLine(); // 사용자 입력을 한 줄 읽어옴

            try {
                // String을 int로 변환 시도
                inputNumber = Integer.parseInt(userInput);

                // 입력된 숫자가 1부터 4 사이인지 확인
                if (inputNumber >= 1 && inputNumber <= 4) {
                    isValidInput = true; // 유효한 입력이면 루프 종료
                } else {
                    System.out.println("잘못된 입력입니다. 1부터 4까지의 숫자를 입력해주세요.");
                }
            } catch (NumberFormatException e) {
                // 숫자로 변환할 수 없는 문자열이 입력되었을 때
                System.out.println("잘못된 형식의 입력입니다. 숫자를 입력해주세요.");
            }
        }
        return inputNumber;
    }

    public static void accountCheck(int inputNumber) {
        switch(inputNumber) {
            case 1 :
                System.out.print("예금액> ");
                deposit += Integer.parseInt(input.nextLine()); // 사용자 입력을 한 줄 읽어옴
                System.out.println();
                break;

            case 2 :
                boolean isValidCheckOut = false;
                while (!isValidCheckOut) {
                    System.out.print("출금액> ");
                    checkOutCash = Integer.parseInt(input.nextLine()); // 사용자 입력을 한 줄 읽어옴

                    if (deposit < checkOutCash) {
                        System.out.printf("현재 예금 잔액이 %d원으로 출금액이 부족하니 다시 출금액을 입력해주세요.\n",deposit);
                        continue;
                    }
                    isValidCheckOut = true; // 출금액이 맞다면 예금액에서 출금액을 빼고, 루프를 빠져나옴
                    deposit -= checkOutCash;

                }
                break;

            case 3 :
                System.out.printf("잔고> %d",deposit);
                break;

            case 4:
                System.out.println();
                System.out.println("프로그램 종료");
                break;

        }
    }
    public static void main(String[] args) {


        showButtons();
        int inputNumber = isValidInputCheck();
        accountCheck(inputNumber);

        while (inputNumber != 4) {  // 4번을 입력하지 않으면
            showButtons();
            isValidInputCheck();
            accountCheck(inputNumber);
        }


    }
}
