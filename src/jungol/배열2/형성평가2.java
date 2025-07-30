package jungol.배열2;

import java.util.Scanner;

public class 형성평가2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int score = 1;
        int[] scoreStep = new int[11];

        while(score!=0) {
            score = sc.nextInt();
            if (score == 0) break;
            scoreStep[score/10]++;
        }

        for (int i=10; i>=0; i--) {
            if (scoreStep[i] > 0)
                System.out.printf("%d : %d person\n", i*10, scoreStep[i]);
        }
    }
}
