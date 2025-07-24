package jungol.입력;
import java.util.Scanner;

public class 입력_자가진단9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double a = Double.parseDouble(sc.next());
        double b = Double.parseDouble(sc.next());
        double c = Double.parseDouble(sc.next());

        System.out.printf("%.3f\n%.3f\n%.3f",a,b,c);
    }
}
