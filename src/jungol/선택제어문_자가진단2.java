package jungol;
import java.util.Scanner;

public class 선택제어문_자가진단2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int height = sc.nextInt();
        int weight = sc.nextInt();
        int fatIndex = weight+100-height;
        System.out.println(fatIndex);
        if (fatIndex > 0) System.out.println("Obesity");
    }
}
