package jungol.배열2;

import java.util.Scanner;

public class 형성평가1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] diceNum = new int[7];
        for(int i = 0; i < 10; i++)
            diceNum[sc.nextInt()]++;

        for (int i = 1; i < diceNum.length; i++) {
            System.out.printf("%d : %d\n",i,diceNum[i]);

        }

    }
}
