package jungol.문자열2;

import java.util.Scanner;

public class 형성평가8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str1;

        while(true) {
            str1 = sc.nextLine();
            if (str1.equals("END")) break;
            for (int i = 0; i < str1.length(); i++) {
                System.out.print(str1.charAt(str1.length()-i-1));
            }
            System.out.println();
        }
    }
}
