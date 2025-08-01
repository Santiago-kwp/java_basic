package javabasic_01.day05.forEx;

public class StarEx03 {
    public static void main(String[] args) {
        for (int i = 1; i <= 4; i++) {
            for (int j = 5; j > 0; j--) {
                if (i<j) {
                    System.out.print(" ");
                } else {
                    System.out.print("*");
                }
            }
            System.out.println();
        }

        System.out.println();
        System.out.println();
        System.out.println("===========================");
        for (int i = 1; i <= 4; i++) {
            for (int j = 5; j > i; j--) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
