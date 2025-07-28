package jungol.반복제어문;

import java.util.Scanner;

public class 반복제어문_자가진단2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int sum = N;
        while (N-- > 0) {
            sum += N;
        }
        System.out.println(sum);
    }
}
