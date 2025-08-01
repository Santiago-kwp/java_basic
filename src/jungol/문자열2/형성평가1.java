package jungol.문자열2;

import java.util.Scanner;

public class 형성평가1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String[] strs = sc.nextLine().split(" ");
        for (int i = strs.length-1; i >= 0; i--) {
            System.out.println(strs[i]);
        }
    }
}
