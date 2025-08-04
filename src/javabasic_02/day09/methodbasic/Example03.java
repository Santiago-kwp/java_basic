package javabasic_02.day09.methodbasic;

public class Example03 {
    public static int division() {
        int a = 10;
        int b = 5;
        int result = 0;
        result = a/b;
        return result;
    }
    public static void main(String[] args) {
        int result = division();
        System.out.println(result);
    }
}
