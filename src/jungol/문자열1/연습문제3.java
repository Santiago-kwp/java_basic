package jungol.문자열1;

import java.util.Scanner;

public class 연습문제3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input = "jungol olympiad";
        for (int i =0; i < 5; i++){
            System.out.print(input.charAt(sc.nextInt()));
        }

    }
}
