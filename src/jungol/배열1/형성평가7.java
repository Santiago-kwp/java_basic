package jungol.배열1;

import java.util.Scanner;

public class 형성평가7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = 0;
        int max = -1000;
        int min = 1000;

        while(true) {
            N = sc.nextInt();
            if (N == 999) break;
            if (N > max) max = N;
            if (N < min) min = N;
        }
        System.out.printf("max : %d\nmin : %d",max,min);

    }
}
