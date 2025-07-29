package jungol.배열1;

import java.util.Scanner;

public class 형성평가9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = 0;
        int[] arr = new int[100];
        int i = 0;

        while(true) {
            N = sc.nextInt();
            if (N == 0) break;
            arr[i++] = N;
        }
        System.out.println(i);
        for(int j = 0; j <100; j++) {
            if (arr[j] == 0) break;
            if (arr[j]%2 ==1) System.out.printf("%d ", 2*arr[j]);
            if (arr[j]%2 ==0) System.out.printf("%d ", arr[j]/2);
        }

    }
}
