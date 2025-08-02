package jungol.배열2;

import java.util.Scanner;

public class 연습문제1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] count = new int[11];
        int n = 0;
        while(true){
            n = sc.nextInt();
            if (n<1 || n>10) break;
            count[n]++;
        }
        for (int i=1; i<=10; i++) {
            if (count[i]>0) System.out.printf("%d : %d개\n",i,count[i]);
        }
    }
}
