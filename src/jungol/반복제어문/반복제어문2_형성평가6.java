package jungol.반복제어문;

import java.util.Scanner;

public class 반복제어문2_형성평가6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int M = sc.nextInt();
        int cnt = 0;
        int sum = 0;
        for (int i=Math.min(N,M);i<=Math.max(N,M);i++) {
            if (i%3==0 | i%5==0) {
                cnt++;
                sum+=i;
            }
        }

        System.out.printf("sum : %d\navg : %.1f",sum, (double)sum/cnt);
    }
}
