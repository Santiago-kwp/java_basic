package jungol.배열1;

import java.util.Scanner;

public class 형성평가6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        char[] jungol = {'J', 'U', 'N', 'G', 'O', 'L'};
        char c = sc.next().charAt(0);
        boolean flag = false;

        for (int i=0; i < 6; i++) {
            if (jungol[i] == c) {
                System.out.println(i);
                flag = true;
                break;
            }
        }
        if (!flag) System.out.println("none");



    }
}
