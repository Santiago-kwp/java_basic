package jungol.연산자;

import java.util.Scanner;

public class 연산자_형성평가4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int w = sc.nextInt();
        int h = sc.nextInt();
        System.out.printf("%d %d\n",++w, h--);
        System.out.printf("%d %d",w, h);

    }
}
