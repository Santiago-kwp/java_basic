package jungol.배열1;

import java.util.Scanner;

public class 형성평가2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] ints = new int[5];
        for (int i=0; i<5; i++) {
            ints[i] = sc.nextInt();
        }
        System.out.println(ints[0]+ints[2]+ints[4]);
    }
}
