package jungol.반복제어문;

import java.util.Scanner;

public class 반복제어문_연습문제6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = 0;
        while(true) {
            System.out.print("1. 입력하기\n2. 출력하기\n3. 삭제하기\n4. 끝내기\n");
            System.out.println("작업할 번호를 선택하세요. ");
            N = sc.nextInt();
            if (N==4) {
                System.out.println("끝내기를 선택하였습니다.");
                break;
            }
            switch(N) {
                case 1 :
                    System.out.println("입력하기를 선택하였습니다."); break;
                case 2:
                    System.out.println("출력하기를 선택하였습니다."); break;
                case 3:
                    System.out.println("삭제하기를 선택하였습니다."); break;
                default:
                    System.out.println("잘못 입력하였습니다.");
            }

        }
    }
}
