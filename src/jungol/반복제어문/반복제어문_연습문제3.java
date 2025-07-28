package jungol.반복제어문;

import java.util.Scanner;

public class 반복제어문_연습문제3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int score = 0;
        while (true) {
            System.out.print("점수를 입력하세요. ");
            score = sc.nextInt();
            if (score < 0 || score > 100) break;
            System.out.println((score>=80)?"축하합니다. 합격입니다.":"죄송합니다. 불합격입니다.");
        }

    }
}
