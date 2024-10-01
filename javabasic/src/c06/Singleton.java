package c06;

// 싱글톤(Singleton): 단 하나만 생성되는 객체
// 전체 프로그램에서 단 하나의 객체만 만들도록 보장해야 하는 경우 사용
// 싱글톤을 만들려면 클래스 외부에서 new 연산자로 생성자를 호출할 수 없도록 해야 한다.
// 생성자를 호출한 만큼 객체가 생성되기 때문
public class Singleton {
	// 자신의 타입인 정적 필드를 하나 선언하고 자신의 객체를 생성해 초기화한다.
	// *클래스 내부에서는 private붙은 필드와 메서드가 사용 가능
	private static Singleton singleton = new Singleton();
	// 생성자를 외부에서 호출할 수 없도록 하려면 생성자 앞에 private 접근 제한자를 붙인다.
	private Singleton() {
		
	}
	// 외부에서 호출할 수 있는 정적 메서드를 선언하고 정적 필드에서 참조하고 있는 자신의 객체 리턴
	static Singleton getInstance() {
		return singleton;
	}
}
