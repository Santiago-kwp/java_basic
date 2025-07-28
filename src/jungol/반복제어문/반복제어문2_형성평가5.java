package jungol.반복제어문;

import java.util.Scanner;

public class 반복제어문2_형성평가5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = 0;
        int even = 0;
        int odd = 0;
        for (int i=0;i<10;i++){
            N = sc.nextInt();
            if (N!=0 && N%2==0) even++;
            if (N%2==1) odd++;
        }

        System.out.printf("even : %d\nodd : %d",even,odd);
    }
}
