package javabasic_01.day03;

public class OperatorEx04 {
    public static void main(String[] args) {

        // & bit 단위로 논리 연산을 수행한다. 대상은 bit인 0과 1
        // 피연산자가 2진수 0과 1로 저장되는 정수타입(byte, short, int, long)만 대상이 된다.
        // 실수타입(float, double)은 bit 연산의 대상이 될 수 없다.

        int num1 = 1;
        int result1 = num1<<3;
        //Math.pow(2,3) => 2의 3제곱 => return 값이 double임
        int result2 = num1 * (int)Math.pow(2,3);
        System.out.println("result1 : " + result1);
        System.out.println("result2 : " + result2);


        int num2 = -62;
        System.out.println("-62>>2 : " + (num2>>3));
        System.out.println("-62>>>2 : " + (num2>>>3));

    }
}
