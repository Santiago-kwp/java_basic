package javabasic_02.day11.inheritance.sec06.package1;

public class B {


	//메소드 선언
    public void method() {
        A a = new A(); // Strong coupling : A를 B의 메소드에 가져다가 꽂았다.(Injection)
        a.field = "value";
        a.method();

    }

    public static void main(String[] args) {
        B b = new B();
        b.method();
    }

}