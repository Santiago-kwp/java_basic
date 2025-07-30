package jungol.배열2;

import java.util.Scanner;

public class 형성평가7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("first array");

        int[][] arr = new int[2][3];


        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                arr[i][j] = sc.nextInt();
            }
        }
        System.out.println("second array");
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                arr[i][j] *= sc.nextInt();
            }
        }

        for (int[] col : arr) {
            for (int i : col)
                System.out.printf("%d ", i);
            System.out.println();
        }
    }
}
