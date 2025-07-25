package jungol.연산자;


import java.util.Scanner;

public class 연산자_연습문제5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();

        System.out.printf("%d %d %d %d", (a==b) ? 1:0, (b==c) ? 1:0, (a!=b)? 1:0,(b!=c)?1:0);

    }
}
