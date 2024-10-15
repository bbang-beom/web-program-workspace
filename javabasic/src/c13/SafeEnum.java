package c13;

public class SafeEnum {
	public void who(Persons man) {
		switch(man) {
		case MAN:
			System.out.println("남자");
			break;
		case WOMAN:
			System.out.println("여자");
			break;
		}
	}
	public static void main(String[] args) {
		SafeEnum safeEnum = new SafeEnum();
		// 정상적인 메서드 호출
		safeEnum.who(Persons.MAN);
		safeEnum.who(Persons.WOMAN);
		// 비정상적인 메서드 호출
		// 컴파일 과정에서 자료형 불일치로 인한 오류 발생
//		safeEnum.who(Animals.DOG); // 실행 불가(컴파일 에러)
	}
}
