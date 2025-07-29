package jungol.배열1;

import java.util.Scanner;

public class 형성평가5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

//        double[] weights = new double[6];
        double weightTotal = 0;
        for (int i = 0; i < 6; i++)
            weightTotal += Double.parseDouble(sc.next());
        System.out.printf("%.1f", weightTotal/6);
    }
}
