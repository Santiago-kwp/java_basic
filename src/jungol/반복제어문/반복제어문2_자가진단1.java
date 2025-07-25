package jungol.반복제어문;

import java.util.Scanner;

public class 반복제어문2_자가진단1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String c = sc.next();
        for(int i=0;i<20;i++) System.out.printf("%c",c.charAt(0));
    }
}
