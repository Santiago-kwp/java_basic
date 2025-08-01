package jungol.문자열2;

import java.util.Scanner;

public class 형성평가3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] strs = new String[50];
        String input;
        int i = 0;
        while(true) {
            input = sc.nextLine();
            if (input.equals("0")) break;
            strs[i++] = input;
        }
        System.out.println(i);
        for (int j = 0; !(strs[j] == null); j+=2) {
            System.out.println(strs[j]);
        }
    }
}
