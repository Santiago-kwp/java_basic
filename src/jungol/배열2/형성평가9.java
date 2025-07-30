package jungol.배열2;

import java.util.Scanner;

public class 형성평가9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[][] pascalTri = new int[n][n];

        // 맨 왼쪽 1로 초기화
        for (int i = 0; i< n; i++)
            pascalTri[i][0] = 1;

        for (int i = 1; i < n ; i++) {
            for (int j = 1; j < n; j++) {
                pascalTri[i][j] = pascalTri[i-1][j] + pascalTri[i-1][j-1];
            }
        }

        for (int i = n-1; i >=0 ; i--) {
            for (int j = 0; j <= i; j++) {
                System.out.printf("%d ", pascalTri[i][j]);
            }
            System.out.println();
        }
    }
}
