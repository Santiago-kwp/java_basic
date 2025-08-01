package javabasic_01.day03;

public class OperatorEx01 {
    public static void main(String[] args) {
        // 부호 연산 : 변수의 부호를 유지하거나 변경한다.
        byte b = 100;
        System.out.println(b);
        // 정수 타입 (byte,short, int)의 연산 결과는 int 타입
        int a = -b;
        System.out.println(a);

        int x = 1;
        int y = 1;
        int result1 = ++x+10; // (x=x+1)+10 => 12
        System.out.println(result1);

        int result2 = y++ + 10;
        System.out.println(result2+ " "+ y);

        System.out.println(y++ + 10);

        byte v1 = 10;
        byte v2 = 4;
        int v3 = 5;
        long v4 = 10L;

        int result4 = v1 + v2; // 모든 피연산자는 int타입으로 자동변환 후 연산 <- byte result4 = v1 + v2를 하게되면 강제형변환 하거나, 컴파일 에러가 남.
        System.out.println(result4);

        long result5 = v1 + v2 - v4; // 모든 피연산자는 long 타입으로 promotion 연산
        System.out.println(result5);

        double result6 = (double)v1/v2; // double으로 타입 강제 형변환 후 연산
        System.out.println(result6);

        int result7 = v1 % v2; // 나눗셈 연산
        System.out.println(result7);

    }
}
