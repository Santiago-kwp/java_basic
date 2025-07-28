package jungol.반복제어문;

import java.util.Scanner;

public class 반복제어문3_형성평가2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();

        for (int i=N; i<100; i+=N) {
            System.out.printf("%d ",i);
            if (i%10 == 0) break;
        }
    }
}
