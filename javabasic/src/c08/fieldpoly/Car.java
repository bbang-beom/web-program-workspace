package c08.fieldpoly;

// 인터페이스의 타입 변환과 다형성
// 다형성
// 인터페이스를 사용하면 구현 객체를 쉽게 교체할 수 있다. 
// 프로그램 소스 코드 변화 없이 구현 객체를 교체함으로써 다양한 프로그램의 실행 결과를 얻을 수 있다.

// 자동 타입 변환
// 구현 객체가 인터페이스 타입으로 변환되는 것
// 인터페이스 변수 = (자동 타입 변환) 구현 객체;
// public class MyClass extends SuperMyClass implements MyInterface{}
// 인터페이스A -> 구현 클래스B -> 자식 클래스C
// A=B, A=C

// 필드의 다형성
public class Car {
//	private Tire t = new HankookTire();
	private Tire t = new KumhoTire();
	
	void run() {
		t.roll();
	}
	
	public static void main(String[] args) {
		Car car = new Car();
		car.run();
	}
}
