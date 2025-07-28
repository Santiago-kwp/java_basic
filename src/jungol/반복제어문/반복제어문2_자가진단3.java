package jungol.반복제어문;


import java.util.Scanner;

public class 반복제어문2_자가진단3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        for(int i=2;i<=N;i+=2) System.out.print(i+" ");
    }
}
