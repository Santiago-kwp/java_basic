package jungol;
import java.util.Scanner;

public class 선택제어문_자가진단1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        System.out.println(N);
        if (N < 10) System.out.println("minus");
    }
}
