package jungol.반복제어문;

import java.util.Scanner;

public class 반복제어문3_형성평가1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = 0;
        int sum = 0;
        int cnt = 0;
        for(int i=0;i<20;i++) {
            N = sc.nextInt();

            if (N==0) break;
            cnt++;
            sum += N;
        }
        System.out.printf("%d %d",sum,sum/cnt);
    }
}
