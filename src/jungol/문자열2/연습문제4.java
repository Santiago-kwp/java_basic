package jungol.문자열2;

import java.util.Scanner;

public class 연습문제4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str1 = sc.next();
        String str2 = sc.next();

        if (str1.length() < str2.length())
            System.out.printf("%s\n%s",str1, str2);
        else
            System.out.printf("%s\n%s",str2, str1);
    }
}
