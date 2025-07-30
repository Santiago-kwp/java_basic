package jungol.배열2;

import java.util.Scanner;

public class 형성평가8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[][] arr = new int[4][2];

        int[] rowAvg = new int[4];
        int[] colAvg = new int[2];
        int total = 0;


        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                arr[i][j] = sc.nextInt();
                total += arr[i][j];
                rowAvg[i] += arr[i][j];
            }
            rowAvg[i] /= 2;
        }
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 4; j++) {
                colAvg[i] += arr[j][i];
            }
            colAvg[i] /= 4;
        }
        for (int i : rowAvg)
            System.out.printf("%d ", i);
        System.out.println();
        for (int i : colAvg)
            System.out.printf("%d ", i);
        System.out.println();
        System.out.println(total/8);



    }
}
