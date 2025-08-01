package jungol.문자열2;

import java.util.Scanner;

public class 형성평가6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String A = sc.next();
        String B = sc.next();
        int n = sc.nextInt();
        A += B;
        System.out.println(A);
        if (n > B.length())
            System.out.println(A.substring(0,n));
        else
            System.out.println(A.substring(0,n)+B.substring(n));

    }
}
