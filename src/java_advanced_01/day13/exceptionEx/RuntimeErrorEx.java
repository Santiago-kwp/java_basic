package java_advanced_01.day13.exceptionEx;

import java.util.InputMismatchException;
import java.util.Scanner;

public class RuntimeErrorEx {
    public static void main(String[] args) {

        try {
            int[] array = {10, 20, 30};
        System.out.println(array[3]);  // IndexOutOfBoundException
//        System.out.println(12 / 0); // div by zero ArithmeticException

            String str = null;
//        System.out.println(str.toLowerCase()); NullPointerException
            // 정수가 아닌 문자열을 정수로 변환할 때 예외 발생 : NumberFormatException
            String stringNumber = "3.1415928268";
//        int number = Integer.parseInt(stringNumber);
            float number = Float.parseFloat(stringNumber);
            System.out.println(number);

            // ClassCastException : 타입변환은 상위클래스와 하위 클래스간의 상속, 인터페이스 캐스팅 시
            Integer num = 30;
            Object x = num;
//        System.out.println((String)x);

            // InputMismatchException
            // 의도치 않은 입력 오류가 발생할 때 예외
            Scanner in = new Scanner(System.in);
            System.out.println("정수 3개를 입력하세요.");

            int num1 = in.nextInt();

            in.close();
        } catch (NumberFormatException e) {
            e.getMessage();
        } catch (InputMismatchException e1) {
            e1.getMessage();
        } catch (ArrayIndexOutOfBoundsException e2) {
            e2.getMessage();
        } catch (ClassCastException e3) {
            e3.getMessage();
        } catch (ArithmeticException e4) {
            e4.getMessage();
        } catch (RuntimeException e5) {
            e5.getMessage();
        } catch (Exception e6) {
            e6.getMessage();
        } catch (Throwable t) {
            t.getMessage();
        }

    }
}
