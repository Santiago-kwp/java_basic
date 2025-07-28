package jungol.반복제어문;

import java.util.Scanner;

public class 반복제어문_연습문제5_1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = 0;
        int cnt = 0;
        int sum = 0;
        while(true) {
            N = sc.nextInt();
            if (N == 0) break;
            if (N%2==1) {
                cnt++;
                sum += N;
            }
        }
        System.out.printf("홀수의 합 = %d\n",sum);
        System.out.printf("홀수의 평균 = %d",sum/cnt);
    }
}
