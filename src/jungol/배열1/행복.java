package jungol.배열1;

import java.util.Scanner;

public class 행복 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int[] arr = new int[N];

        for (int i = 0; i<N; i++)
            arr[i] = sc.nextInt();

        int max = arr[0];
        int min = arr[0];

        for (int i=1; i<N; i++) {
            if (max < arr[i]) max = arr[i];
            if (min > arr[i]) min = arr[i];
        }
        System.out.println(max-min);
    }
}
