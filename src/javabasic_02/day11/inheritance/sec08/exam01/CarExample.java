package javabasic_02.day11.inheritance.sec08.exam01;

public class CarExample {
	public static void main(String[] args) {
		//Car 객체 생성
		Car mydreamCar = new Car();

		//Tire 객체 장착 및 메소드 실행
		mydreamCar.tire = new Tire();
		mydreamCar.run();


		//KumhoTire 객체 장착 = 부품 injection
		mydreamCar.tire = new KumhoTire();
		mydreamCar.run();

		//HankookTire 객체 장착
		mydreamCar.tire = new HankookTire();
		mydreamCar.run();

	}
}