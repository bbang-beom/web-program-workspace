package task.Inheritance;

public class Parent {
	// 4번 문제
	public String name;
	
	public Parent(String name) {
		this.name = name;
	}
}

class Task1 {
	// 1번 문제
	// 자바 상속에 대한 설명
	// 자바는 다중 상속을 허용한다. (x) 자바는 다중 상속을 허용하지 않는다
	// 부모와 메서드를 자식 클래스에서 재정의(오버라이딩)할 수 있다. (o)
	// 부모의 private 접근 제한을 갖는 필드와 메서드는 상속의 대상이 아니다. (x) 상속 가능하다. 상속의 대상이 아닌 것은 final 키워드
	// protected 멤버는 같은 패키지의 모든 클래스와 다른 패키지의 자식 클래스만 접근할 수 있다. (o)
}

class Task2 {
	// 2번 문제
	// 메서드 재정의(오버라이딩)에 대한 설명
	// 부모의 메서드는 숨김 효과가 나타난다. (o)
	// 재정의 접근 제한을 더 강하게 할 수 있다. (x) 재정의 접근 제한을 더 강하게 할 수 없다.
	// @Override를 붙이면 컴파일러가 재정의를 확인한다. (o)
	// 부모 메서드를 호출하고 싶다면 super 키워드를 사용할 수 있다. (o)
}

class Task3 {
	// 3번 문제
	// final 클래스, final 필드, final 메서드에 대한 설명
	// 모두 상속과 관련이 있다. (x) final 필드는 상속과 관련 없다.
	// final 메서드를 가진 클래스는 부모 클래스가 될 수 없다 (o)
	// final 메서드는 재정의를 할 수 없다 (o)
	// final 클래스는 final 필드가 반드시 있어야 한다. (x) 없어도 된다.
}
