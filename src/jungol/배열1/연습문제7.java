package jungol.배열1;


import java.util.Scanner;

public class 연습문제7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] arr = new int[10];
        int maxEven = -1000;
        int minOdd = 1000;
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
            if (arr[i] % 2 == 0 && maxEven < arr[i])
                maxEven = arr[i];
            // 음수의 홀수 처리 필요
            if (Math.abs(arr[i]) % 2 == 1 && minOdd > arr[i])
                minOdd = arr[i];
        }
        System.out.printf("%d %d",minOdd, maxEven);

    }
}
