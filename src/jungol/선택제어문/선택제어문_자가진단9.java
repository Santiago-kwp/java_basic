package jungol.선택제어문;
import java.util.Scanner;

public class 선택제어문_자가진단9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        int min = a;
        min = (a<b) ? ((a<c) ? a:c) : ((b<c) ? b: c);
        System.out.println(min);
    }
}
