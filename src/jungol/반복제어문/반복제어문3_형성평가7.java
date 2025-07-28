package jungol.반복제어문;

import java.util.Scanner;

public class 반복제어문3_형성평가7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int alphaPlus = 0;
        int numPlus = 0;
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < 2*N-1; j++) {
                if (j%2!=0) System.out.print(" ");
                else if (2*(N-i-1) >= j) {
                    System.out.print((char) ('A' + alphaPlus++));
                }
                else System.out.print(numPlus++);

            }
            System.out.println();
        }
    }
}
