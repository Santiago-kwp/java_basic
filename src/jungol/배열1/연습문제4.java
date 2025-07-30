package jungol.배열1;


import java.util.Scanner;

public class 연습문제4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[100];
        int input = 0;
        for (int i = 0; i < arr.length; i++) {
            input = sc.nextInt();
            if (input == 0) break;
            arr[i] = input;
        }
        int even = 1;
        while (arr[even]!=0) {
            System.out.printf("%d ", arr[even]);
            even += 2;
        }

    }
}
