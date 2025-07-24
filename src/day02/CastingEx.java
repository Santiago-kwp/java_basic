package day02;

public class CastingEx {
    public static void main(String[] args) {

        // long => int 8 => 4
        long longValue = 300;
        int intValue = (int) longValue;

        System.out.println(intValue);

        // int => char
        // int타입은 char 타입으로 자동변환 되지 않고, (char)강제캐스팅해야 한다. 0 ~ 65535 사이의 값만 원래 값을 유지
        int intValue2 = 65;
        char charValue = (char) intValue2;
        System.out.println(charValue);

        // 실수 => 정수

        double doubleValue = 3.14;
        int intValue3 = (int) doubleValue;
        System.out.println(intValue3);

        // 예외사항 정리 : 자바에서 + 연산자 두 가지 기능을 가지고 있음. 덧셈 연산 , 연결 연산(concat)
        String str1 = "3" + 7;
        System.out.println(str1);

        String str = "";
        str = 1 + 2 + "3";  // 3 + "3" => "33"

        System.out.println(str);

        str = 1 + "2" + 3; // "12"+3 => "123"
        System.out.println(str);

        str = "1" + 2 + 3; // "123"
        System.out.println(str);

        str = "1" + (2+3);  // "15"
        System.out.println(str);


    }
}
