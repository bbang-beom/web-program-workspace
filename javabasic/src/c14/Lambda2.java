package c14;

public class Lambda2 {

	public static void main(String[] args) {
		Printable prn = new Printable() {
			
			@Override
			public void print(String s) {
				System.out.println("익명 클래스");
				System.out.println(s);
			}
		};
		prn.print("Lambda");
		// prn이 Printable형 참조변수이므로 =연산자 왼쪽에 new 키워드가 있고, 메서드 정의가 있기 때문에,
		// 익명 클래스를 기반으로 보아 인스턴스 생성이다.
		/*
		Printable prn = new Printable() 
			@Override
			public void print(String s) {
				System.out.println("익명 클래스");
				System.out.println(s);
		};
		*/
		// Printable 인터페이스에 있는 메서드 public void print(String s)는 뻔하다.
		/*
		Printable prn =  {
				System.out.println("익명 클래스");
				System.out.println(s);
		};
		 */
		
		// 람다식의 인자 전달
		Printable prn1 = (s) -> {
			System.out.println("람다");
			System.out.println(s);
		};
		prn1.print("Lambda");
	}
}
