package c06;

// 정적 멤버와 static
// 정적(static): 고정된
// 클래스에 고정된 멤버로써 인스턴스를 생성하지 않고 사용할 수 있는 필드와 메서드
// 이들을 각각 정적 필드, 정적 메서드라 한다.
public class StaticMember {
	// 정적 멤버 선언
	// 정적 필드와 메서드를 선언하려면 필드와 메서드에 static 키워드를 붙인다.
	// 정적 필드: static 타입 변수 이름[=초기화];
	// 정적 메서드: static 리턴 타입 메서드 이름([매개 변수, ...]){}
	static final Car car = new Car();	
	// 인스턴스 필드
	String color;
	// 인스턴스 메서드
	void setColor(String color) {
		this.color = color;
	}
	// 정적 필드
	static double pi = 3.14;
	// 정적 메서드
	static int plus(int x, int y) {
		return x + y;
	}
	// 정적 메서드는 인스턴스가 없어도 실행된다는 특징 때문에 내부에 인스턴스 필드나 인스턴스 메서드를 사용할 수 없다.
	static void method1() {
//		this.color = "white"; // (this 사용 불가)
		System.out.println(pi);
	}
	
	public static void main(String[] args) {
		System.out.println("static method");
		// 정적 멤버 사용
		// 클래스가 메모리로 로딩되면 정적 멤버를 바로 사용할 수 있다.
		// 클래스 이름과 함께 도트(.)연산자로 접근한다.
		// 정적 필드와 메서드 사용을 최대한 자제하는 것이 좋다.
		System.out.println(StaticMember.pi);
		System.out.println(StaticMember.plus(3, 4));
		
	}
}
