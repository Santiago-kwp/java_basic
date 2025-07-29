package day05;

public class StarEx05 {
    public static void main(String[] args) {
        for (int i = 1; i <= 4; i++) {
            for (int j = 1; j <= i; j++) { // _ 찍기
                System.out.print("_");
            }
            for (int j = 5; j > i; j--) { // * 찍기
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
