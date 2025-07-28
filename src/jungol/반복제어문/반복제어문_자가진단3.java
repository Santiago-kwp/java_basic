package jungol.반복제어문;

import java.util.Scanner;

public class 반복제어문_자가진단3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = 0;
        while(true) {
            System.out.print("number? ");
            N = sc.nextInt();
            if (N==0) break;
            System.out.println((N>0)?"positive integer":"negative number");
        }
    }
}
