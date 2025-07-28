package jungol.반복제어문;

import java.util.Scanner;

public class 반복제어문2_형성평가2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int M = sc.nextInt();

        for(int i=Math.min(N,M);i<=Math.max(N,M);i++) System.out.print(i+" ");
    }
}
