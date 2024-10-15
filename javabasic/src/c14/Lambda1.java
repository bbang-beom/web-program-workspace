package c14;

public class Lambda1 {
	public static void main(String[] args) {
		// 이름이 있는 클래스
		Printer p = new Printer();
		Printable prn2 = p;
		Printable prn3 = new Printer();
		// 익명 클래스
//		Printable prn = new Printable(); // interface는 객체 생성 불가
		Printable prn1 = new Printable() {
			
			@Override
			public void print(String s) {
				System.out.println("printing...");
				System.out.println(s);
			}
		};
		
		// 익명 클래스를 함축하는 대신 추상 메서드가 하나인 인터페이스에 대해서 
		// 익명 클래스를 함축하는 람다를 사용할 수 있다.
		Printable prn = (s) -> {System.out.print(s);};
		prn.print("Lambda");
		// 추상 메서드를 하나 가지고 있는 인터페이스를 구현하는 방법
		// 1. class 생성해서 구현
		// 2. 인터페이스형 참조 변수에 참조시킬때 익명 클래스 생성해서 구현
		// 3. 인터페이스형 참조 변수에 참조시킬때 람다로 추상 메서드 생성해서 구현
	}
}
