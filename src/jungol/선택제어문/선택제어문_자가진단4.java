package jungol;
import java.util.Scanner;

public class 선택제어문_자가진단4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double weight = Double.parseDouble(sc.nextLine());
        if (weight > 88.45 ) System.out.println("Heavyweight");
        else if (weight > 72.57) System.out.println("Cruiserweight");
        else if (weight > 61.32) System.out.println("Middleweight");
        else if (weight > 50.80) System.out.println("Lightweight");
        else System.out.println("Flyweight");
    }
}
