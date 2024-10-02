package c07;

// 메서드 재정의- 메서드 오버라이딩(Overriding)
// 상속된 메서드를 자식 클래스에서 다시 수정해서 덮어 쓰는 것

// 메서드 재정의 방법
// 부모의 메서드와 동일한 시그니처(리턴 타입, 메서드 이름, 매개 변수 목록)을 가져야 한다.
// 더 강한 접근 제한으로 재정의 할 수 없다.  (private > protected > default > public)
// 새로운 예외(Exception)를 throws할 수 없다.
public class Calculator {
	public double areaCircle(double r) {
		System.out.println("Calculator 객체의 areaCircle()실행");
		return 3.14159 * r * r;
	}
}
