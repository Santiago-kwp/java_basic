package jungol.반복제어문;

import java.util.Scanner;

public class 별삼각형1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();

        if (n <= 0 || n > 100 || m < 1 || m > 3) {
            System.out.println("INPUT ERROR!");
            return;
        }

        switch (m) {
            case 1:
                for (int i = 1; i <= n; i++) {
                    for (int j = 1; j <= i; j++) {
                        System.out.print("*");
                    }
                    System.out.println();
                }
                break;
            case 2:
                for (int i = 1; i <= n; i++) {
                    for (int j = 0; j <= n-i; j++) {
                        System.out.print("*");
                    }
                    System.out.println();
                }
                break;
            case 3:
                for (int i = 1; i <= n; i++) {
                    for (int j = 1; j <= n-i; j++) {
                        System.out.print(" ");
                    }
                    for (int star = 1; star <= 2*i-1; star++) {
                        System.out.print("*");
                    }
                    System.out.println();
                }
                break;

        }


    }
}
