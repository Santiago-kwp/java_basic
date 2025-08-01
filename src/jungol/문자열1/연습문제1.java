package jungol.문자열1;

import java.util.Scanner;

public class 연습문제1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char input = ' ';

        do {
            input = sc.nextLine().charAt(0);
            System.out.printf("%c -> %d\n",input, (int)input);
        } while (input!='0');

    }
}
