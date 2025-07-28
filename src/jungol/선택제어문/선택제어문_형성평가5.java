package jungol.선택제어문;
import java.util.Scanner;

public class 선택제어문_형성평가5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] monthDays = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
        System.out.println(monthDays[sc.nextInt()-1]);

    }
}
