package c02;

public class C02_02_02 {

	public static void main(String[] args) {
		// char 타입
		// 하나의 문자를 작은 따옴표(')안에 적은 것을 문자 리터럴이라 한다.
		// 문자 리터럴은 유니코드(unicode)로 변환되어 저장
		// *유니코드: 세계 각국의 문자를 2byte로 표현할 수 있는 숫자(0~65535)로 매핑한 국제 표준 규약
		char var1 = 'A'; // A
		char c = 65; // A
		System.out.println(var1);
		System.out.println(c);
		
		// String 타입 
		// 자바에서 큰 따옴표(" ")안에 적은 문자들을 문자열이라고 부른다.
		String str1 = "A";
		String str2 = "foo bar";
		
		/*
		 * String타입은 기본 타입이 아니다.
		 * String은 클래스 타입
		 */
		
		// 큰따옴표(*)는 문자열 식별 기호인데 데이터로 사용하려면
		// 문자열 내부에 역슬래쉬(\)를 사용한다.
		// \는 이스케이프(escape) 문자라고 하는데, 이스케이프 문자를 사용하면
		// 문자열 내부에 특정 문자를 포함시킬 수 있다.
		System.out.println("철수가 말했다. \"안녕\""); // 철수가 말했다. "안녕"
		// 탭만큼 띄우기 - \t
		System.out.println("id \t| name");
		// 개행 - \n
		System.out.println("홍길동\n김자바");
	}
}
