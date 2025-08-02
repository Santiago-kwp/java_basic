package jungol.배열2;

import java.util.Scanner;

public class 연습문제5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[][] arr1 = new int[3][3];

        for (int i = 0; i < arr1.length; i++) {
            System.out.printf("첫 번째 배열 %d행 ",i+1);
            for (int j = 0; j < arr1[i].length; j++) {
                arr1[i][j] = sc.nextInt();
            }
        }
        for (int i = 0; i < arr1.length; i++) {
            System.out.printf("두 번째 배열 %d행 ",i+1);
            for (int j = 0; j < arr1[i].length; j++) {
                arr1[i][j] += sc.nextInt();
            }
        }
        for (int[] ints : arr1) {
            for (int n : ints)
                System.out.printf("%d ",n);
            System.out.println();
        }

    }
}
