package jungol.배열1;

import java.util.Scanner;

public class 자가진단1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        char[] arr = new char[10];

        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.next().charAt(0);
        }

        for (char i : arr) {
            System.out.printf("%c",i);
        }
    }
}
