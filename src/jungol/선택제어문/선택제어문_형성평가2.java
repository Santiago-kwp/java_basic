package jungol.선택제어문;
import java.util.Scanner;

public class 선택제어문_형성평가2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();

        System.out.println((a==0)?"zero":(a>0)?"plus":"minus");
    }
}
