package jungol.배열1;

import java.util.Scanner;

public class 형성평가4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] ints = new int[100];
        int N = 0;
        int i = 0;
        while(true) {
            N = sc.nextInt();
            if (N==-1) break;
            ints[i++] = N;
        }
        if (i < 3) {
            for (int j=0; j<i; j++)
                System.out.printf("%d ", ints[j]);
        } else {
            for (int j=i-3; j<i; j++)
                System.out.printf("%d ", ints[j]);
        }
    }
}
