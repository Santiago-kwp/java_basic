package java_advanced_01.day13.exceptionEx;

public class ThrowsEx {
    static void check() throws ArithmeticException {
        System.out.println("내부 메서드");
        int div = 5/0;
    }

    public static void main(String[] args) {
        try {
            check();
        }
        catch(ArithmeticException e) {
            System.out.println("예외발생 " + e);
        }
    }
}
