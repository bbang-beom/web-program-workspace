package c06;

public class Method {
	// 메서드의 기본 문법
	/*
	 * 리턴타입 메서드 이릅([매개변수 선언,...]) {
	 * 실행할 코드
	 * }
	 */
	
	// 메서드 선언
	// 리턴 타입: 리턴 값의 타입
	// 리턴 값: 메서드를 실행한 후 결과 값
	int plus (int x, int y) {
		int result = x + y;
		return result;
	}
	
	// 리턴 값이 없는 메서드 - 리턴타입 자리에 void 키워드
	void powerOn() {
		System.out.println("전원을 켭니다.");
	}
	
	
	public static void main(String[] args) {
		Method m = new Method();
		System.out.println(m.plus(1, 2));
		// 메서드의 호출(method call) 메서드 이름([매개변수,...])
		m.powerOn();
		int result = m.plus(3, 4);
		System.out.println(result);
		// 리턴 값을 받기 위해 변수는 plus() 메서드의 리턴 타입인 int 타입으로 선언
		// 다른 타입으로 선언된 변수로 리턴값을 대입 받을 수 없다.
//		char r = m.plus(1, 2); // error
		
		// 리턴 타입이 있다고 해서 반드시 리턴 값을 변수에 저장할 필요는 없다.
		//리턴 값이 중요하지 않고, 메서드 실행이 중요한 경우에는 변수를 선언하지 않고 메서드를 호출 할 수 있다.
		m.plus(5, 5);
	}
}
