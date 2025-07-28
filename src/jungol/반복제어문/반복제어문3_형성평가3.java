package jungol.반복제어문;

import java.util.Scanner;

public class 반복제어문3_형성평가3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();

        for (int i=-N+1;i<N;i++) {
            for (int j=0; j<Math.abs(Math.abs(i)-N);j++) System.out.print("*");
            System.out.println();
        }
    }
}
