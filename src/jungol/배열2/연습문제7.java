package jungol.배열2;


import java.util.Scanner;

public class 연습문제7 {
    public static void main(String[] args) {
        int[][] pascal = new int[5][5];
        pascal[0][0] = 1;
        for (int i=1; i < 5; i++) {
            for (int j=0; j<=i; j++) {
                if (j>0) pascal[i][j] = pascal[i-1][j-1]+pascal[i-1][j];
                else pascal[i][j]=1;
            }
        }
        for (int i=0; i < 5; i++){
            for (int j=0; j<=i; j++){
                System.out.printf("%d ",pascal[i][j]);
            }
            System.out.println();
        }

    }
}
