package jungol.반복제어문;

public class 반복제어문3_연습문제5 {
    public static void main(String[] args) {
        int N = 5;
        for (int i=0;i<N;i++) {
            for (int j=0; j<2*N-1;j++) {
                if (j >= N+i) break;
                if (j < (N-i-1)) System.out.print(" ");
                else System.out.print("*");
            }
            System.out.println();
        }
    }
}
