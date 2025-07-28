package jungol.반복제어문;

import java.util.Scanner;

public class 반복제어문2_형성평가10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int M = sc.nextInt();

        for (int i=1;i<=9;i++){
            if (N > M) {
                for (int j=N;j>=M;j--)
                    System.out.printf("%d * %d = %2d   ",j,i,j*i);
            }
            else {
                for (int j=N;j<=M;j++)
                    System.out.printf("%d * %d = %2d   ",j,i,j*i);
            }

            System.out.println();
        }


    }
}
