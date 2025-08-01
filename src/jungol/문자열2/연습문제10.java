package jungol.문자열2;

import java.util.Scanner;

public class 연습문제10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String str1 = sc.next();
        String str2 = sc.next();
        System.out.printf("%s + %s = %d\n",str1, str2, Integer.parseInt(str1)+Integer.parseInt(str2));

        String str3 = sc.next();
        String str4 = sc.next();
        System.out.printf("%.2f + %.2f = %.2f\n",Double.parseDouble(str3), Double.parseDouble(str4), Double.parseDouble(str3)+Double.parseDouble(str4));

    }
}
