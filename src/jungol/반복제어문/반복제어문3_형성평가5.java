package jungol.반복제어문;

import java.util.Scanner;

public class 반복제어문3_형성평가5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        for (int i = 0; i < N; i++) {
            for (int j=0; j < 2*N-1; j++){
                if (2*(N-i-1)-j > 0) System.out.print(" ");
                else System.out.print("*");
            }
            System.out.println();
        }
    }
}
