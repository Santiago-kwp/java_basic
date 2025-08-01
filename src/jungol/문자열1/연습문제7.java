package jungol.문자열1;

import java.util.Scanner;

public class 연습문제7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char c = ' ';
        String input = sc.nextLine();
        for (int i = 0; i < input.length(); i++) {
            c = input.charAt(i);
            System.out.printf("%c",(c >= 'a' && c <= 'z') ? c +('A'-'a') : (c >= 'A' && c <= 'Z') ? c +('a'-'A') : c);

        }
    }
}
