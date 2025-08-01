package jungol.문자열2;

import java.util.Scanner;

public class 연습문제11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String[] number3 = new String[3];
        for (int i = 0; i < 3; i++) {
            System.out.print(String.format("%.2f",Double.parseDouble(sc.next())).replace(".","\n"));
        }
    }
}
