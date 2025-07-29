package jungol.반복제어문;

import java.util.Scanner;

public class 반복제어문3_자가진단7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int num = 1;
        char alpha = 'A';
        for (int i=0; i < N; i++) {
            for (int j=0; j < (N-i);j++) {
                System.out.printf("%d ", num++);
            }
            for (int j=0; j <= i; j++) {
                System.out.printf("%c ", alpha++);
            }
            System.out.println();
        }

    }
}
