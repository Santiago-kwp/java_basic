package jungol.문자열2;

import java.util.Scanner;

public class 형성평가5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] strs = new String[5];

        for (int i=0; i < 5; i++) {
            strs[i] = sc.nextLine();
        }
        String s1 = sc.nextLine();
        String word = sc.nextLine();

        int count = 0;
        for (String str : strs) {
            if (str.contains(s1) || str.contains(word)) {
                System.out.println(str);
                count++;
            }
        }
        if (count==0) System.out.println("none");

    }
}
