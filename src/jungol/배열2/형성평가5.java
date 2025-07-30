package jungol.배열2;

import java.util.Scanner;

public class 형성평가5 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int[][] nums = new int[4][3];
        int[] total = new int[4];

        for (int i = 0; i < 4; i++) {
            System.out.printf("%dclass? ",i+1);
            for (int j = 0; j < 3; j++) {
                nums[i][j] = sc.nextInt();
                total[i] += nums[i][j];
            }
        }
        for (int i = 0; i < 4; i++)
            System.out.printf("%dclass : %d\n",i+1,total[i]);
    }
}
