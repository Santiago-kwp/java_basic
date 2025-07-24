package jungol;
import java.util.Scanner;

public class 선택제어문_연습문제2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int M = sc.nextInt();
        int big = (N > M) ? N : M;
        int small = (N < M) ? N : M;
        System.out.printf("입력받은 수 중 큰 수는 %d이고 작은 수는 %d입니다.",big, small);
    }
}
