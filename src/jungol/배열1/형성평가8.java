package jungol.배열1;

import java.util.Scanner;

public class 형성평가8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = 0;
        int total5 = 0;
        int cnt5 = 0;

        while(true) {
            N = sc.nextInt();
            if (N == 0) break;
            if (N%5 ==0) {
                total5 += N;
                cnt5++;
            }
        }

        System.out.printf("Multiples of 5 : %d\nsum : %d\navg : %.1f",cnt5, total5, (double)total5/cnt5);
    }
}
