package c06;

// 생성자
public class Constructor {
	// 기본 생성자
	// 모든 클래스는 생성자가 반드시 존재하며, 생성자를 하나 이상 가질 수 있다.
	public static void main(String[] args) {
		// 클래스 내부에 생성자 선언을 생략했다면, 컴파일러는 다음과 같은 기본 생성자를 바이트 코드에 자동으로 추가한다.
		Constructor c = new Constructor();
	}
	public Constructor() {
		// 클래스에 생성자를 선언하지 않아도 다음과 같이 new 연산자 뒤에 기본 생성자를 호출해서 객체를 생성할 수 있다.
		// 클래스에 명시적으로 선언한 생성자가 1개라도 있으면 컴파일러는 기본 생성자를 추가하지 않는다.
		// 명시적으로 생성자를 선언하는 이유는 객체를 다양한 값으로 초기화하기 위해서이다.
	}

}
