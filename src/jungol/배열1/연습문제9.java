package jungol.배열1;


import java.util.Scanner;

public class 연습문제9 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = 10;
        int[] arr = new int[n];
        int temp = 0;

        for (int i=0; i<n; i++)
            arr[i] = sc.nextInt();
        // 버블 정렬 구현
        for (int j = 1; j < n; j++) {
            for (int k = j; k > 0; k--) {

                if (arr[k-1] < arr[k]) {
                    temp = arr[k-1];
                    arr[k-1] = arr[k];
                    arr[k] = temp;
                }
            }
        }

        for (int e : arr) System.out.printf("%d ",e);

    }
}
