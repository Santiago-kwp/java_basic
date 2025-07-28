package jungol.반복제어문;

import java.util.Scanner;

public class 반복제어문_연습문제4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = 0;
        int cnt = 0;
        int sum = 0;
        while(true) {
            N = sc.nextInt();
            if (N == 0) break;
            cnt++;
            sum += N;
        }
        System.out.printf("입력된 자료의 개수 = %d\n", cnt);
        System.out.printf("입력된 자료의 합계 = %d\n", sum);
        System.out.printf("입력된 자료의 평균 = %.2f", (double)sum/cnt);

    }
}
