package jungol.반복제어문;

import java.util.Scanner;

public class 반복제어문3_연습문제1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int add = 0;
        int sum = 0;
        while(sum<=N) {
            add++;
            sum+=add;
        }
        System.out.printf("%d %d",add,sum);

    }
}
