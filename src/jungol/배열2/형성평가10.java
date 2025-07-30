package jungol.배열2;

import java.util.Scanner;

public class 형성평가10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        char[][] lowerCase = new char[3][5];

        for (int i = 0; i < lowerCase.length; i++) {
            for (int j = 0; j < lowerCase[i].length; j++) {
                lowerCase[i][j] = (char) (sc.next().charAt(0)+('a'-'A'));
            }
        }

        for (char[] col : lowerCase) {
            for (char c : col) {
                System.out.printf("%c ", c);
            }
            System.out.println();
        }
    }
}
