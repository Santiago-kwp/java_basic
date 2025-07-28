package jungol.반복제어문;

import java.util.Scanner;

public class 반복제어문3_연습문제2 {
    public static void main(String[] args) {
        for (int i=0;i<3;i++) {
            for (int j=0; j<=i;j++) {
                System.out.print("*");
            }
            System.out.println();
        }

    }
}
