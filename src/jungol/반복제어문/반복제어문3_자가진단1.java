package jungol.반복제어문;

import java.util.Scanner;

public class 반복제어문3_자가진단1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int odd = 1;
        int oddSum = 0;
        while(oddSum<N) {
            oddSum += odd;
            odd += 2;
        }
        System.out.printf("%d %d",(odd-1)/2,oddSum);

    }
}
