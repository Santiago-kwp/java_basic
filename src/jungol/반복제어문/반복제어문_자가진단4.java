package jungol.반복제어문;

import java.util.Scanner;

public class 반복제어문_자가진단4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = 0;
        int cnt = 0;
        int sum = 0;
        while(true) {
            N = sc.nextInt();
            cnt++;
            sum += N;
            if (N >= 100) break;
        }
        System.out.println(sum);
        System.out.printf("%.1f",(double)sum/cnt);
    }
}
