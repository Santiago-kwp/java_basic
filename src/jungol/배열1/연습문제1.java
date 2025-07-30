package jungol.배열1;

import java.util.Scanner;

public class 연습문제1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] arr = new int[5];

        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }

        for (int i : arr) {
            System.out.printf("%d ",i);
        }
    }
}
