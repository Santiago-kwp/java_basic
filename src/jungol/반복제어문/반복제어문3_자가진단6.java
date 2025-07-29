package jungol.반복제어문;

import java.util.Scanner;

public class 반복제어문3_자가진단6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int alpha = 65;
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                if (j >= (N-i)) break;
                System.out.print((char)alpha++);
            }
            System.out.println();
        }

    }
}
