package c10;

// java.lang 패키지
// java.lang 패키지는 자바 프로그램의 기본적인 클래스를 담고있는 패키지

// 자바 API Document
// API(Application Programing Interface)
// API는 프로그램 개발에 자주 사용되는 클래스 및 인터페이스의 모음으로써 라이브러리(library)라고도 한다.
// 방대한 자바 표준 API 중 원하는 API를 찾게 도와주는 API Document가 있다.
// https://docs.oracle.com/en/java/javase/index.html
// https://docs.oracle.com/javase/8/docs/api/index.html

// Object 클래스
// 클래스를 선언할 때 extends 키워드로 다른 클래스를 상속하지 않더라도 묵시적으로 java.lang.Object클래스를 상속받는다.
// 때문에, 자바의 모든 클래스는 Object 클래스의 자식 클래스거나 자손 클래스이다. 
// 즉, Object 클래스는 자바의 최상위 부모 클래스이다.
// Object 클래스는 필드가 없고, 생성자와 메서드로 구성되어 있다.
// 모든 클래스의 최상위 부모가 Object 클래스 이므로 모든 클래스가 Object 클래스의 메서드를 사용할 수 있다.

// 객체 비교(equals())
// public boolean equals(Object obj) {...}
public class JavaLangPakage {
	private String name;
	
	public JavaLangPakage(String name) {
		this.name = name;
	}
	
	public static void main(String[] args) {
		JavaLangPakage jlp1 = new JavaLangPakage("Object");
		JavaLangPakage jlp2 = new JavaLangPakage("Object");
		// 문자열 동일 비교
		if(jlp1.name == jlp2.name) {
			System.out.println(jlp1.name + "==" + jlp2.name);
		}else {
			System.out.println(jlp1.name + "!=" + jlp2.name);
		}
		
		// 객체 동일 비교
		if(jlp1.equals(jlp2)) {
			System.out.println(jlp1 + "==" + jlp2);
		}else {
			System.out.println(jlp1 + "!=" + jlp2);
		}
		// 객체 해시코드(hashcode())
		// 객체 해시코드는 객체를 식별하는 하나의 정수값
		// Object 클래스의 hashCode() 메서드는 객체의 메모리 번지를 이용해서 해시코드를 만들어서 리턴하기 때문에 
		// 객체마다 다른 값을 가지고 있다.
		System.out.println(jlp1.hashCode());
		
		// 객체 문자 정보(toString())
		// Object 클래스의 toString() 메서드는 객체의 문자 정보를 리턴
		// *문자 정보: 객체를 문자열로 표현한 값
		// 기본적으로 toString() 메서드는 클래스이름@'16진수 해시코드'로 구성된 문자 정보를 리턴
		System.out.println(jlp1.toString());
	}
}
