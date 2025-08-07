package javabasic_02.day11.inheritance.sec07.exam02;

public class ChildExample {
	public static void main(String[] args) {
		//자식 객체 생성
		Child child = new Child();
//		child.method1();


		//자동 타입 변환
		Parent parent = child; // child is Parent


		//메소드 호출
		parent.method1();
//		parent.method2();
		// parent.method3(); ~ 안됨. 메소드3는 parent 타입에 없음.
		Child child1 = (Child) parent; // 메모리를 확장하려면 (Child)로 타입 casting 필요함.
//		child1.method3();

	}
}