package jungol.반복제어문;

import java.util.Scanner;

public class 반복제어문_형성평가5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int base = 0;
        int height = 0;
        char flag = ' ';
        while(true) {
            System.out.print("Base = ");
            base = sc.nextInt();
            System.out.print("Height = ");
            height = sc.nextInt();
            System.out.printf("Triangle width = %.1f\n",base*height/2.0);
            System.out.print("Continue? ");
            flag = sc.next().charAt(0);
            if (flag != 'Y' && flag != 'y') break;
        }
    }
}
