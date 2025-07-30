package jungol.배열2;

import java.util.Scanner;

public class 윷놀이 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int count1 = 0;
        char[] yut = {'D', 'C', 'B', 'A', 'E'};

        for (int i = 0; i < 3; i++) {
            count1 = 0;
            for (int j =0; j < 4; j++)
                count1 += sc.nextInt();
            System.out.println(yut[count1]);
        }






    }
}
