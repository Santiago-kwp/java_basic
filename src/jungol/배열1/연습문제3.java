package jungol.배열1;


import java.util.Scanner;

public class 연습문제3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[10];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        for (int i : new int[]{2, 4, 9})
            System.out.printf("%d ", arr[i]);


    }
}
