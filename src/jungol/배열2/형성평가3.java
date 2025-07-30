package jungol.배열2;

import java.util.Scanner;

public class 형성평가3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] arr = new int[10];

        for (int i = 0; i < 2; i++)
            arr[i] = sc.nextInt();

        for (int i = 2; i < 10; i++)
            arr[i] = (arr[i - 2] + arr[i - 1]) % 10;

        for (int i : arr)
            System.out.printf("%d ", i);

    }
}
