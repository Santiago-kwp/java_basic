package jungol;
import java.util.Scanner;

public class 선택제어문_자가진단5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double r1 = Double.parseDouble(sc.next());
        double r2 = Double.parseDouble(sc.next());

        if (r1 >= 4.0 & r2 >= 4.0) System.out.println("A");
        else if (r1 >= 3.0 & r2 >= 3.0) System.out.println("B");
        else System.out.println("C");
    }
}
