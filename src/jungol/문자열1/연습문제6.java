package jungol.문자열1;

import java.util.Scanner;

public class 연습문제6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char input = ' ';
        boolean flag = false;
        do {
            input = sc.nextLine().charAt(0);
            if (input >= 'A' && input <= 'Z') System.out.println("대문자입니다.");
            else if (input >= 'a' && input <= 'z') System.out.println("소문자입니다.");
            else if (input >= '0' && input <= '9') System.out.println("숫자문자입니다.");
            else flag = true;
        } while(!flag);
        System.out.println("영문, 숫자 이외의 문자입니다.");

    }
}
