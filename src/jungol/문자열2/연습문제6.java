package jungol.문자열2;

import java.util.Scanner;

public class 연습문제6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String[] strs = sc.nextLine().split(" ");

        System.out.println(strs[1].substring(0,3)+strs[0].substring(3));
        System.out.println(strs[1]+strs[0].substring(0,3));

    }
}
