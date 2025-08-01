package jungol.문자열1;

import java.util.Scanner;

public class 연습문제9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String input = sc.nextLine();
        for (int i = 0; i < input.length(); i++) {
            System.out.println(input.substring(i+1)+input.substring(0,i+1));

        }
    }
}
