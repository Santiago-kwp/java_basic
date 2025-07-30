package jungol.배열1;


import java.util.Scanner;

public class 연습문제5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] leapYear = {31, 29, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
        int[] commonYear = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
        boolean learOrCommon = false;

        // 연월 초기화
        int year = 1;
        int month = 1;

        while (month !=0) {
            System.out.print("YEAR = ");
            year = sc.nextInt();
            System.out.print("MONTH = ");
            month = sc.nextInt();
            if (month == 0) continue;
            if (month < 1 || month > 12) {
                System.out.println("잘못 입력하였습니다.");
                System.out.println();
                continue;
            }

            // 윤년 판별
            if (year%400==0 || (year%4==0 && year%100!=0)) {
                learOrCommon = true;
            }

            if (learOrCommon) System.out.printf("입력하신 달의 날 수는 %d일입니다.\n", leapYear[month-1]);
            else System.out.printf("입력하신 달의 날 수는 %d일입니다.\n", commonYear[month-1]);
            System.out.println();

        }
    }
}
