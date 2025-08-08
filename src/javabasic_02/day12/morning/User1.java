package javabasic_02.day12.morning;

public class User1 {

    public static void main(String[] args) {
        Service service = new ServiceImpl(); // ServiceImpl2 로 바꿔도 전혀 문제가 없음 : Loose Coupling임

        // 디폴트 메소드 호출
        service.defaultMethod1();
        service.defaultMethod2();

        // 정적 메소드 호출
        Service.staticMethod1();
        Service.staticMethod2();

    }
}
