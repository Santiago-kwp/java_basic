package jungol.배열1;

import java.util.Scanner;

public class 형성평가3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] ints = new int[10];
        int oddTotal = 0;
        int evenTotal = 0;
        for (int i=0; i<10; i++) {
            ints[i] = sc.nextInt();
        }
        for (int i=0; i<10; i+=2){
            oddTotal += ints[i];
            evenTotal += ints[i+1];
        }

        System.out.printf("odd : %d\neven : %d", oddTotal, evenTotal);
    }
}
