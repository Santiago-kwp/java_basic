package jungol.반복제어문;

import java.util.Scanner;

public class 반복제어문3_자가진단5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < 2 * N - 1; j++) {
                if (j < i) System.out.print(" ");
                else if (j >= (2 * N - 1 - i)) break;
                else System.out.print("*");
            }
            System.out.println();
        }

    }
}
