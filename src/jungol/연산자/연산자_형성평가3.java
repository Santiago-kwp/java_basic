package jungol.연산자;

import java.util.Scanner;

public class 연산자_형성평가3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int w = sc.nextInt();
        int h = sc.nextInt();

        w += 5;
        h *= 2;
        System.out.printf("width = %d\nlength = %d\narea = %d",w,h,w*h);
    }
}
