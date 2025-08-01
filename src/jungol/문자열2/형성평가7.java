package jungol.문자열2;

import java.util.Scanner;

import static java.lang.Character.isDigit;

public class 형성평가7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str1 = sc.next();
        String str2 = sc.next();

        int num1 = 0;
        for(int i = 0; i < str1.length(); i++) {
            if(isDigit(str1.charAt(i))) {
                num1 = num1*10+(str1.charAt(i)-'0');
            }
            else break;
        }
        int num2 = 0;
        for(int i = 0; i < str2.length(); i++) {
            if(isDigit(str2.charAt(i))) {
                num2 = num2*10+(str2.charAt(i)-'0');
            }
            else break;
        }

        System.out.println(num1*num2);
    }
}
