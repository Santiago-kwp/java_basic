package javabasic_02.test.loop_array;

public class javaBasic7 {
    public static void main(String[] args) {
        int n = 2;
        for (int i = -n; i <= n; i++) {
            for (int j = 0; j < Math.abs(i); j++) {
                System.out.print(" ");
            }

            for (int j = 0; j < 2*(n-Math.abs(i))+1; j++) {
                System.out.print("@");
            }
            System.out.println();

        }
    }
}
