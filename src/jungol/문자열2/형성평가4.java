package jungol.문자열2;

import java.util.Arrays;
import java.util.Scanner;

public class 형성평가4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.nextLine();
        String[] strs = new String[n];
        for (int i=0; i < n; i++) {
            strs[i] = sc.nextLine();
        }
        Arrays.sort(strs);
        for (String str : strs)
            System.out.println(str);
    }
}
