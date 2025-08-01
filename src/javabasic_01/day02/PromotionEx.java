package javabasic_01.day02;

public class PromotionEx {
    public static void main(String[] args) {

        // byte < short, char < int < long < float < double;

        byte byteValue = 10;
        int intValue = byteValue; // 자동 타입 변환 : byte -> int , 값 복사가 일어남.

        long longValue = 5000000000000L; // long 리터럴 정의 시 L, l을 뒤에 붙인다. int와의 구분을 위함
        float floatValue = longValue;
        double doubleValue = longValue;

        System.out.println(floatValue);
        System.out.println(doubleValue);

        float f1 = 3.14f; // 그냥 3.14를 쓰게 되면 데이터 누수될 수 있음. double -> float 넣는 것
        float f2 = 3E6f;  // float 리터럴 값은 마지막에 f,F를 붙인다.

        System.out.println(f1+ "  " + f2);

    }
}
