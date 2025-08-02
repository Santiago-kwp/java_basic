package jungol.배열2;

import java.util.Scanner;

public class 연습문제3 {

    public static int fibo(int n) {
        if (n==1 | n==2) return 1;
        return fibo(n-1)+fibo(n-2);
    }
    public static void main(String[] args) {
        for(int n : new int[]{10, 20, 30, 40})
            System.out.printf("피보나치 수열 %d항 : %d\n",n,fibo(n));

    }
}
