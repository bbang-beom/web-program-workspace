package c13;

public class NonSafeConst {
	public void who(int man) {
		switch(man) {
		case Person.MAN:
			System.out.println("남자");
			break;
		case Person.WOMAN:
			System.out.println("여자");
			break;
		}
	}
	public static void main(String[] args) {
		NonSafeConst nonSafeConst = new NonSafeConst();
		// 정상적인 메서드 호출
		nonSafeConst.who(Person.MAN); // 남자
		// 비정상적인 메서드 호출
		// 컴파일 및 실행 과정에서 발견되지 않는 오류
		nonSafeConst.who(Animal.DOG); // 남자
		// 이전 방식의 문제점을 보완하고 인터페이스 기반 상수의 사용을 대체하기 위한 새로운 문법을 만든 것이 열거형(enum)이다.
	}
}
