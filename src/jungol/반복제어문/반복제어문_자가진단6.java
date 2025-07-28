package jungol.반복제어문;

import java.util.Scanner;

public class 반복제어문_자가진단6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = 0;
        while(true) {
            System.out.print("1. Korea\n2. USA\n3. Japan\n4. China\nnumber?\n");
            N = sc.nextInt();

            switch(N) {
                case 1 :
                    System.out.println("Seoul"); break;
                case 2:
                    System.out.println("Washington"); break;
                case 3:
                    System.out.println("Tokyo"); break;
                case 4:
                    System.out.println("Beijing"); break;
                default:
                    N=5;
            }
            if (N==5) {
                System.out.println("none");
                break;
            }

        }
    }
}
