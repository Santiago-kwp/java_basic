package jungol.선택제어문;
import java.util.Scanner;

public class 선택제어문_형성평가3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int year = sc.nextInt();

        System.out.println(year%400==0 | (year%4==0 && year%100!=0)?"leap year":"common year");
    }
}
