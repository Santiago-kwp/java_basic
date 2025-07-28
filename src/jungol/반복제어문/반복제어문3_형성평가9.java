package jungol.반복제어문;

import java.util.Scanner;

public class 반복제어문3_형성평가9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();

        for (int i = 0; i < 2*N-1; i++) {
            for (int j = 0; j < 2*N-1; j++) {
                if (j > 2*i) break;
                if (j % 2 != 0) {
                    System.out.print(" ");
                }
                else if (j >= 2*(i-N+1)) {
                    System.out.print("#");
                }
                else System.out.print(" ");
            }
            System.out.println();
        }
    }
}
