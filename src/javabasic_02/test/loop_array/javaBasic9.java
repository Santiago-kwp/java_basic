package javabasic_02.test.loop_array;

import java.util.Arrays;
import java.util.Scanner;

public class javaBasic9 {

    static int userInputNumber = 0;
    static Scanner input = new Scanner(System.in);

    static int studentNumber = 0;
    static int[] scores;


    public static void main(String[] args) {
        showButtons();
        userInputNumber = isValidInput();   // 유효한 정수 입력인지 확인
        mainMenu(userInputNumber);

        while(userInputNumber!=5) {
            showButtons();
            userInputNumber = isValidInput();
            mainMenu(userInputNumber);
        }

    }

    public static void showButtons() {
        System.out.println("""
                    ------------------------------------------------------
                    1. 학생수 | 2. 점수입력 | 3. 점수리스트 | 4. 분석 | 5. 종료
                    ------------------------------------------------------
                    """);
    }

    public static int isValidInput() {
        int inputNumber = 0;
        boolean isValidInput = false;

        while(!isValidInput) {
            System.out.print("선택> ");
            String userInput = input.nextLine(); // 사용자 입력을 한 줄 읽어옴

            try {
                // String을 int로 변환 시도
                inputNumber = Integer.parseInt(userInput);

                // 입력된 숫자가 1부터 5 사이인지 확인
                if (inputNumber >= 1 && inputNumber <= 5) {
                    isValidInput = true; // 유효한 입력이면 루프 종료
                } else {
                    System.out.println("잘못된 입력입니다. 1부터 5까지의 숫자를 입력해주세요.");
                }
            } catch (NumberFormatException e) {
                // 숫자로 변환할 수 없는 문자열이 입력되었을 때
                System.out.println("잘못된 형식의 입력입니다. 숫자를 입력해주세요.");
            }
        }
        return inputNumber;
    }

    public static void mainMenu(int inputNumber) {
        switch(inputNumber) {
            case 1 :
                boolean isValidInput = false;
                while(!isValidInput) {
                    System.out.print("학생수> ");
                    String userInput = input.nextLine(); // 사용자 입력을 한 줄 읽어옴
                    try {
                        // String을 int로 변환 시도
                        studentNumber = Integer.parseInt(userInput);
                        scores = new int[studentNumber]; // 학생들 점수 배열 생성
                        isValidInput = true; // 유효한 입력이면 루프 종료
                    } catch (NumberFormatException e) {
                        // 숫자로 변환할 수 없는 문자열이 입력되었을 때
                        System.out.println("잘못된 형식의 입력입니다. 숫자를 입력해주세요.");
                    }
                }
                break;

            case 2 : // 점수 입력
                for (int i = 0; i < scores.length; i++) {
                    System.out.printf("scores[%d]: \n",i);
                    scores[i] = Integer.parseInt(input.nextLine());
                }
                break;

            case 3 : // 점수 출력
                for (int i = 0; i < scores.length; i++) {
                    System.out.printf("scores[%d]: %d\n",i, scores[i]);
                }
                break;

            case 4 : // 분석
                Arrays.sort(scores);
                int total = 0;
                for (int score : scores) {
                    total += score;
                }
                System.out.printf("최고 점수: %d\n",scores[studentNumber-1]);
                System.out.printf("평균 점수: %.1f\n",(double)total/studentNumber);
                break;

            case 5:
                System.out.println();
                System.out.println("프로그램 종료");
                break;
        }
    }

}
