package c07.poly;

public class Cat extends Animal{
	
	@Override
	public void method2() {
		System.out.println("Child-method2()");
	}
	
	public void method3() {
		System.out.println("Child-method3()");
	}

	public static void main(String[] args) {
		// 자식 클래스는 부모의 특징과 기능을 상속받기 때문에 부모 클래스와 동일하게 취급이 가능하다.
		// Cat 클래스로부터 Cat 인스턴스를 생성하고 이를 Animal 변수에 대입하면 자동 타입 변환이 일어난다.
		Cat cat1 = new Cat();
		Animal a1 = new Cat();
		Animal a2 = cat1;
		
		// 부모 타입으로 자동 타입 변환된 이후에는 부모 클래스에 선언된 필드와 메서드만 접근 가능하다.
		Animal a3 = new Cat();
		a3.method1();
		// 메서드가 자식 클래스에서 재정의되었다면 자식 클래스의 메서드가 대신 호출된다.
		a3.method2();
//		a3.method3(); // 접근 불가
	}
}
