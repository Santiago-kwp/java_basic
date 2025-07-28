package jungol.반복제어문;

import java.util.Scanner;

public class 반복제어문_형성평가3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = 0;
        int cnt = 0;
        int sum = 0;
        while(true) {
            N = sc.nextInt();
            if (N<0 || N>100) break;
            cnt++;
            sum += N;
        }
        System.out.printf("sum : %d\navg : %.1f", sum, (double)sum/cnt);
    }
}
