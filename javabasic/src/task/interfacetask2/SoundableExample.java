package task.interfacetask2;

class task1 {
	// 인터페이스에 대한 설명
	// 인터페이스는 객체 사용 방법을 정의해놓은 타입이다. (O)
	// new 연산자를 이용해서 인터페이스 객체를 만들 수 있다. (X) 인터페이스는 객체를 생성할 수 없다.
	// 인터페이스는 상수 필드와 추상 메서드를 갖는다. (O)
	// 구현 클래스는 implements 키워드로 인터페이스를 기술해야한다. (O)
}

class task2 {
	// 인터페이스 사용에 대한 설명
	// 클래스를 선언할 때 인터페이스 타입의 필드를 선언할 수 있다. (O)
	// 생성자의 매개 타입이 인터페이스일 경우, 매개값으로 구현 객체를 대입한다. (O)
	// 인터페이스 타입의 로컬 변수는 선언할 수 없다. (X) 변수에 구현 객체를 대입하여 선언 가능하다.
	// 메서드의 매개 타입이 인터페이스일 경우, 매개값으로 구현 객체를 대입한다. (O)
}

public class SoundableExample {
	private static void printSound(Soundable soundable) {
		System.out.println(soundable.sound());
	}
	public static void main(String[] args) {
		printSound(new Cat());
		printSound(new Dog());
	}
}

class Cat implements Soundable {
	public String sound() {
		return "야옹";
	}
}

class Dog implements Soundable {
	public String sound() {
		return "멍멍";
	}
}