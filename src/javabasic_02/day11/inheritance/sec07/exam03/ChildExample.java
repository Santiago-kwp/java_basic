package javabasic_02.day11.inheritance.sec07.exam03;

public class ChildExample {
	public static void main(String[] args) {
		// 부모 타입으로 자식 객체를 생성하세요.
		Parent parent = new Child();

		//객체 생성 및 자동 타입 변환



		//Parent 타입으로 필드와 메소드 사용
		parent.field1 = "data1111";
		parent.method1();
		parent.method2();
		// parent.field2 = "data2222" ~ 안됨.
		// parent.method3(); ~ 안됨

		
		//강제 타입 변환
		Child child = (Child)parent;
		child.field2 = "data2222";
		child.method3(); //~ 체계적으로 데이터를 관리하는데 적합하다!

		
		//Child 타입으로 필드와 메소드 사용

	}
}