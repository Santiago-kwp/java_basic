package jungol.문자열2;

import java.util.Arrays;
import java.util.Scanner;

public class 연습문제8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String str1 = sc.next();
        String str2 = sc.next();

        int compInt = str1.compareTo(str2);

        System.out.printf("%s 가(이) 더 큽니다.\n",(compInt > 0)?str1:str2);

        if (str1.substring(0,3).equals(str2.substring(0,3))) {
            System.out.println("앞의 세 문자가 같습니다.");
        }
        else System.out.println("앞의 세 문자가 같지 않습니다.");
    }
}
