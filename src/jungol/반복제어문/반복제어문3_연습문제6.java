package jungol.반복제어문;

import java.util.Scanner;

public class 반복제어문3_연습문제6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int add = 1;
        for (int i=0;i<N;i++) {
            for (int j=0; j<2*N-1;j++) {
                if (j > 2 * i+1) break;
                if (j%2!=0) System.out.print(" ");
                else System.out.print(add++);
            }
            System.out.println();
        }
    }
}
