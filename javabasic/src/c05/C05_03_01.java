package c05;

// 상수(constants)
// 변경이 불가능한 수
// 키워드 final 선언이 붙어있는 변수

// final 선언
// 상수의 이름은 모두 대문자로 짓는 것이 관례
// 이름이 둘 이상의 단어로 이뤄질 경우 언더바(_)로 연결
public class C05_03_01 {

	public static void main(String[] args) {
		// ex
		final int MAX_SIZE = 100;
		final char CONST_CHAR = '상';
		// 할당 (이후 변경 불가)
		final int CONST_ASSIGNED;
		CONST_ASSIGNED = 12;
		
		final int NUM = 0;
//		NUM = 12; error 발생(상수는 변경 불가)
	}

}
