package javabasic_02.day09.methodbasic;

import java.util.Scanner;

public class Example06 {
    static Scanner in = new Scanner(System.in);

    public static double adder(double n1, double n2) {
        return n1 + n2;
    }
    public static double minus(double n1, double n2) {
        return n1 - n2;
    }

    public static double multi(double n1, double n2) {
        return n1 * n2;
    }
    public static double div(double n1, double n2) {
        return n1/n2;
    }
    public static void main(String[] args) {
        System.out.println("""
                =================================================
                                  사칙연산 계산기
                =================================================
                1. 덧셈  2. 뺄셈  3. 곱셈  4. 나눗셈  5. 프로그램 종료
                
                두 수를 차례로 입력하고 수행할 사칙연산의 메뉴 숫자를 입력해주세요
                """);
        double n1, n2, result = 0.0;
        int choice = 0;
        while(true){
            n1 = Double.parseDouble(in.next());
            n2 = Double.parseDouble(in.next());
            choice = in.nextInt();
            if(choice == 5) {
                System.out.println("프로그램을 종료합니다.");
                break;
            }

            switch(choice) {
                case 1 -> result = adder(n1, n2);
                case 2 -> result = minus(n1, n2);
                case 3 -> result = multi(n1, n2);
                case 4 -> result = div(n1, n2);
            }

            System.out.printf("결과는 \n %.1f", result);
        }

    }
}
