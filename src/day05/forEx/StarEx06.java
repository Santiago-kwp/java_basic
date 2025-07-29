package day05;

public class StarEx06 {
    public static void main(String[] args) {
        for (int i = 1; i <= 5; i++) {
            for (int j = 1; j <= 6-i; j++) { // _ 찍기
                System.out.print("_");
            }
            for (int star = 1; star <= 2*i-1; star++) { // * 찍기
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
