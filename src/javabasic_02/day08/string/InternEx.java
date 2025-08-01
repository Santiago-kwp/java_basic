package javabasic_02.day08.string;
// intern() : 자바에서 문자열을 최적화하여 관리하기 위한 메소드
// 문자열을 리터럴로 선언할 경우 내부적으로 String의 intern() 메소드가 호출이 된다.
// 해당 리터럴이 문자열 상수 풀(Literal constant pool)안에 존재하는지 확인,
// 만약 존재하면 해당 pool의 리터럴을 리턴한다.
// 존재하지 않는다면 리터럴을 pool안에 집어 넣고 새로운 주소값을 반환
public class InternEx {
    public static void main(String[] args) {
        String str1 = "Hello";
        String str2 = new String(new char[]{'H','e','l','l','o'}).intern();

        System.out.println(str1 == str2);
        // 해당 코드의 의미는 무엇인가?
        // intern 메소드의 기능을 확인하는 코드로 이미 literal constant pool에 존재하는 문자열인지 확인하고, 존재한다면 그 주소값을 str2에 할당해줌
        // 그러므로 true를 반환함.

        String str3 = new String("Hi");
        String str4 = "Hi";

        str3 = str3.intern();
        System.out.println(str3 == str4); // true


    }
}
