package java_advanced_01.day13.exceptionEx;

public class MyExceptionTest {
    void check(int weight) throws MyException01 {
        if (weight < 100) {
            throw new MyException01("MyException01 클래스 호출입니다.");
        }
    }

    public static void main(String[] args) {
        MyExceptionTest obj = new MyExceptionTest();
        try {
            obj.check(50);
        } catch (MyException01 e) {
            System.out.println("예외 처리입니다.");
            System.out.println(e.getMessage());
        }
    }
}
