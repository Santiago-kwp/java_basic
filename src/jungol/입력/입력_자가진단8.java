package jungol.입력;
import java.util.Scanner;

public class 입력_자가진단8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double a = Double.parseDouble(sc.next());
        double b = Double.parseDouble(sc.next());
        String c = sc.next();
        System.out.printf("%.2f\n%.2f\n%s",a,b,c);
    }
}
