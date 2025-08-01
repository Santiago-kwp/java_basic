package jungol.문자열1;

import java.util.Scanner;

public class 연습문제4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();
        System.out.printf("입력받은 문자열의 길이는 %d입니다.\n", input.length());
        for (int i = 0; i < input.length(); i++) {
            System.out.printf("%c",input.charAt(input.length()-i-1));
        }
    }
}
