package jungol.반복제어문;


public class 반복제어문3_연습문제3 {
    public static void main(String[] args) {
        int N = 3;

        for (int i=0; i < N; i++) {
            for (int j=0; j <= i; j++)
                System.out.print("*");
            System.out.println();
        }

        for (int i=0; i < N; i++) {
            for (int j=0; j < (N-i); j++)
                System.out.print("*");
            System.out.println();
        }



    }
}
