package jungol.반복제어문;

import java.util.Scanner;

public class 반복제어문_형성평가2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N;
        int odd = 0;
        int even = 0;
        while(true) {
            N = sc.nextInt();
            if (N==0) break;
            if (N % 2 == 0) even++;
            else odd++;
        }
        System.out.printf("odd : %d\neven : %d", odd, even);
    }
}
