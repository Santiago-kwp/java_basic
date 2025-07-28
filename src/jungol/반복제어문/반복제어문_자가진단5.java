package jungol.반복제어문;

import java.util.Scanner;

public class 반복제어문_자가진단5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = 0;

        while(true) {
            N = sc.nextInt();
            if (N < 0) break;
            if (N%3 == 0) System.out.println(N/3);
        }

    }
}
