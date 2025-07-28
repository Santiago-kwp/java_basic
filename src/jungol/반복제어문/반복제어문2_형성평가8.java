package jungol.반복제어문;

import java.util.Scanner;

public class 반복제어문2_형성평가8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int M = sc.nextInt();
        for (int i=1;i<=N;i++) {
            for (int j=i;j<=i*M;j+=i)
                System.out.print(j+" ");
            System.out.println();
        }


    }
}
