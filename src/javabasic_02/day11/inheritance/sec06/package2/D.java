package javabasic_02.day11.inheritance.sec06.package2;


import javabasic_02.day11.inheritance.sec06.package1.A;
// 다른 패키지이므로 import 해와야 쓸 수 있음.
public class D  extends A {
	//생성자 선언
    public D() {
        super(); // extends A의 기본 생성자를 호출하여라
    }

	//메소드 선언
    public void method1() {  // 상속을 통해서만 사용 가능
        this.field = "value";
        this.method();
    }


	//메소드 선언
    public void method2() { // 만약 A의 생성자가 protected라면 일반 인스턴스 생성인 new A로는 직접 객체 생성해서 사용 안됨.
//        A a = new A();
//        a.field = "value";
//        a.method();
    }


}