package jungol.반복제어문;

import java.util.Scanner;

public class 반복제어문2_형성평가3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int sum = 0;
        for (int i=1;i<=N;i++)
            sum += (i%5==0)?i:0;
        System.out.println(sum);
    }
}
