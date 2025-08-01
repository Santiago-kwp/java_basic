package jungol.문자열2;

import java.util.Scanner;

public class 형성평가2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] strs = {"flower", "rose", "lily", "daffodil", "azalea"};
        char c = sc.nextLine().charAt(0);
        int count = 0;

        for (String str : strs) {
            if (str.charAt(1) == c || str.charAt(2) == c) {
                count++;
                System.out.println(str);
            }
        }
        System.out.println(count);
    }
}
