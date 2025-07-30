package jungol.배열1;


import java.util.Scanner;

public class 연습문제8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] arr = new int[10];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        int total = 0;
        for (int i : arr)
            total += i;
        System.out.printf("총점 = %d\n평균 = %.1f",total,total/10.0);

    }
}
