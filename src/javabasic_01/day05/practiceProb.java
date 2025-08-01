package javabasic_01.day05;

import java.util.Scanner;

public class practiceProb {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("당신의 이름을 입력하세요 (Ex. 홍길동) : ");
        String username = input.nextLine();
        System.out.println("연락처를 입력하세요 (Ex. 010-1234-5678) : ");
        String userMobile = input.nextLine();

        int choiceNum = 0; // 사용자 선택번호 초기화
        while (choiceNum != 8) {
            System.out.println("""
                    ***********************************************************
                                    Welcome to Shopping Mall
                                    Welcome to Book Market!
                    ***********************************************************
                     1. 고객 정보 확인하기          4. 바구니 항목 추가하기
                     2. 장바구니 상품 목록 보기      5. 장바구니의 항목 수량 줄이기
                     3. 장바구니 비우기             6. 장바구니의 항목 삭제하기
                     7. 영수증 표시하기             8. 종료
                    ***********************************************************
                    """);
            System.out.print("메뉴 번호를 선택해주세요 ");
            choiceNum = Integer.parseInt(input.nextLine()); // 메뉴 번호 정수형으로 받기

            switch (choiceNum) {  // switch문으로 선택한 메뉴에 따라 콘솔 출력
                case 1:
                    System.out.println("현재 고객 정보 : ");
                    System.out.println("이름 " + username + " 연락처 " + userMobile);
                    break;
                case 8:
                    System.out.println("프로그램이 종료됩니다.");
                    break;
                default:  // 1 ~ 8 이외의 숫자 입력 시 처음으로 돌아감
                    System.out.println("잘못된 번호 입력입니다.");
                    choiceNum = 0;
            }
        }
    }
}
