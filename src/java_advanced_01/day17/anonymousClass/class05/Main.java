package java_advanced_01.day17.anonymousClass.class05;

import java_advanced_01.day13.C;

public class Main {
    public static void main(String[] args) {
        int num1 = 10;
        int num2 = 20;

        Calculator calculator = new Calculator(num1, num2);

        Operate add = (n1, n2) -> n1 + n2;
        Operate minus = (n1, n2) -> n1 - n2;

        int result = calculator.calculate(add);
        int result2 = calculator.calculate(minus);
        System.out.println(result);
        System.out.println(result2);
    }

}
