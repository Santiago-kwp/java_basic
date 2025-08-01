package javabasic_01.day05.forEx;

public class StarEx07 {
    public static void main(String[] args) {
        int n = 4;
        for (int row = -n; row <= n; row++) {
            for (int col = 1; col <= Math.abs(row); col++) { // 공백찍기
                System.out.print(" ");
            }
            for (int col = 1; col <= 2 * (n - Math.abs(row)) + 1; col++) { // 별 찍기
                System.out.print("*");
            }
            System.out.println();
        }

    }
}
