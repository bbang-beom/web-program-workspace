package c07.poly;

// 클래스의 타입 변환
// 클래스의 타입 변환은 상속 관계에 있는 클래스 사이에서 발생한다.
// 자식 클래스는 부모 클래스의 타입으로 자동 타입 변환이 가능하다.
public class Animal {
	
	public void method1() {
		System.out.println("Parent-method1 called");
	}
	
	public void method2() {
		System.out.println("Parent-method2 called");
	}
}
