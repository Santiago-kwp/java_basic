package jungol.배열1;

import java.util.Scanner;

public class 형성평가1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        char[] chars = new char[10];
        for (int i=0; i<10; i++) {
            chars[i] = sc.next().charAt(0);
        }
        for (int i=0; i<10; i++)
            System.out.print(chars[9-i]+" ");
    }
}
