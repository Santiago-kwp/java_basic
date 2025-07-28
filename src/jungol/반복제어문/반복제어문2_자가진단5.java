package jungol.반복제어문;

import java.util.Scanner;
import java.util.stream.IntStream;

public class 반복제어문2_자가진단5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int cnt3 = 0;
        int cnt5 = 0;
        int N = 0;

        for (int i=0;i<10;i++) {
            N = sc.nextInt();
            if (N%3==0) cnt3++;
            if (N%5==0) cnt5++;
        }

        System.out.printf("Multiples of 3: %d\nMultiples of 5: %d",cnt3,cnt5);

    }
}
