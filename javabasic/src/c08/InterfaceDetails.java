package c08;

// 인터페이스(interface)
// 인터페이스는 개발 코드와 객체가 서로 통신하는 접점 역할을 한다.
// 개발 코드를 수정하지 않고 객체를 변경하기 위해 사용한다.
// 인터페이스 선언
// [public] interface 인터페이스이름{}
// 인터페이스 이름은 클래스 이름을 작성하는 방법과 동일하다.
// 영어 대소문자를 구분하고, 첫 글자를 대문자로 하고 나머지는 소문자로 하는 것이 관례
public interface InterfaceDetails {
	// 인터페이스 멤버
	// 인터페이스는 상수 필드와 추상 메서드 만 구성 멤버로 가진다.
	// 상수
	// 타입 상수이름 = 값;
	// 추상 메서드
	// 타입 메서드이름(매개변수,...);
	// 인터페이스는 객체(인스턴스)로 생성할 수 없기 때문에 생성자를 가질 수 없다.
	
	// 상수 필드 선언
	// 인터페이스는 객체 사용 방법을 정의한 것이므로 실행 시 데이터를 저장할 수 있는 인스턴스 또는 정적 필드를 선언할 수 없고,
	// 상수 필드만 선언 가능하다.
	// 상수는 public static final로 선언하는데, 생략하더라도 컴파일 과정에서 자동으로 설정된다.
	// [public static final] 타입 상수이름 = 값;
	// 상수 이름은 대문자로 작성하되, 서로 다른 단어로 구성되어 있을 경우에는 언더바(_)로 연결하는 것이 관례이다.
	// 인터페이스 상수는 반드시 선언과 동시에 초기값을 지정해야 한다.
	public int MAX_VALUE = 10;
	int MIN_VOLLUME = 0;
	public static final int MIDDLE_VALUE = 5;
	
	// 추상 메서드 선언
	// 실행 블록이 필요없는 추상 메서드로 선언한다.
	// 추상 메서드는 리턴 타입, 메서드 이름, 매개 변수만 기술되고 중괄호{}를 붙이지 않는 메서드를 말한다.
	// 리턴 타입 메서드이름(매개변수,...);
	public void turnOn();
	public void turnOff();
	public void setVolume(int volume);
}
