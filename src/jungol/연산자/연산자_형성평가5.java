package jungol.연산자;

import java.util.Scanner;

public class 연산자_형성평가5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int h1 = sc.nextInt();
        int w1 = sc.nextInt();
        int h2 = sc.nextInt();
        int w2 = sc.nextInt();

        System.out.printf("%b",(h1>h2 && w1>w2));

    }
}
