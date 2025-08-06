package javabasic_02.day11.inheritance.qa;

public class Inheritance01 extends Calculation{
    public int multiplication(int a, int b){
        return a * b;
    }

    public static void main(String[] args) {
        Inheritance01 obj = new Inheritance01();
        System.out.printf("%d와 %d 두 수의 합은 %d", 3, 4, obj.addition(3,4));
    }
}
