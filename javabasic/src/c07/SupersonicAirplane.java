package c07;

public class SupersonicAirplane extends Airplane{
	private String flyMode = "NORMAL";
	
	@Override
	public void fly() {
		//부모 메서드 호출 - super.fly();
		if(flyMode == "SUPERSONIC") {
			System.out.println("초음속비행합니다.");
		} else {
			super.fly();
		}
		// 자식 클래스에서 부모 클래스의 메서드를 재정의하면 부모 클래스의 메서드는 숨겨지고 
		// 재정의된 자식 클래스의 메서드만 사용된다. 
		//그러나, 자식 클래스 내부에서 재정의된 부모 클래스의 메서드를 호출한다면 
		// 명시적으로 super 키워드를 붙여서 부모 클래스의 메서드를 호출할 수 있다.
	}
	public static void main(String[] args) {
		SupersonicAirplane sa = new SupersonicAirplane();
		sa.fly();
	}
	// final 클래스와 final 메서드
	// final 키워드는 클래스, 필드, 메서드를 선언할 때 사용할 수 있는데,
	// 필드를 선언할 때는 final이 지정되면 초기값 설정 이후 값을 변경할 수 없어진다.
	// 클래스를 선언할 때는 final 키워드를 앞에 붙이면 그 클래스는 상속할 수 없는 클래스가 된다. 
	// 즉, final 클래스는 부모 클래스가 될 수 없어 자식 클래스를 만들 수 없어진다.
	// 메서드를 선언할 때는 final 키워드를 붙이면 재정의 할 수 없는 메서드가 된다.
	// 즉, 부모 클래스에 있는 final 메서드는 상속할 때 자식 클래스에서 재정의 할 수 없어진다.
	
	// protected 접근 제한자
	// 다른 패키지에서는 자식 클래스만 접근을 허용하는 접근 제한자
	// 다른 클래스의 클래스 변수는 Getter, Setter를 이용하므로 일반적으로는 많이 쓰이지 않는다.
}
