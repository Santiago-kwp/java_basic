package jungol.반복제어문;

import java.util.Scanner;

public class 반복제어문3_연습문제7 {
    public static void main(String[] args) {

        int N = 5;
        int num = 1;
        char alpha = 'a';
        for (int i = 0; i < (N-1); i++) {
            for (int j = 0; j < 2 * N - 1; j++) {
                if (j % 2 != 0) System.out.print(" ");
                else {
                    if (j <= 2 * i) System.out.print(alpha++);
                    else System.out.print(num++);
                }
            }
            System.out.println();
        }
    }
}
