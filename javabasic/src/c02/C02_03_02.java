package c02;

public class C02_03_02 {

	public static void main(String[] args) {
		// 실수 연산에서의 자동 타입 변환
		//피연산자가 동일한 타입이면 해당 타입으로 연산
		//피연산자 중 하나가 double 타입이면 다른 피연산자도 double 타입으로 자동 타입 변환
		double result = 1.2f+3.4;
		
		//int타입과 double타입을 연산해도 double타입으로 자동 변환
		int intValue = 10;
		double doubleValue = 5.5;
		double result1 = intValue + doubleValue;
		
		int x = 1;
		int y = 2;
		double result3 = x/y;
		System.out.println(result3); // 0.0(자바에서 정수 연산의 결과는 정수)
		
		// 강제 타입 변환
		double result4 = (double)x/y;
		System.out.println(result4);
		
		double result5 = x/(double)y;
		System.out.println(result5);
		
		double result6 = x/(double)y;
		System.out.println(result6);
		
		/*
		 * + 연산에서의 문자열 자동 타입 변환
		 * 자바에서 +연산자는 두가지 기능이 있음
		   1. 피연산자가 모두 숫자인 경우 덧셈 연산
		   2. 피연산자 중 하나가 문자열일 경우 나머지 피연산자도 문자열로 자동 변환하여 문자열 결합 연산
		   숫자 + 숫자 -> 덧셈 연산 -> 숫자
		   "문자열" + 숫자 or 숫자 + "문자열" -> 결합 연산 => "문자열숫자" or "숫자문자열"
		 */
		int v1 = 3 + 7;
		System.out.println(v1); // 10
		String s1 = "3" + 7;
		System.out.println(s1); // 37
		String s2 = 1 + "2" + 3 + 4 + 5;
		System.out.println(s2); // 12345
		
		// 특정 부분을 우선 연산하고 싶을 경우
		int i1 = 2 + 3 * 8;
		System.out.println(i1); // 26 우선순위 수학과 동일
		int i2 = (2 + 3) * 8;
		//우선 연산하고 싶은 부분을 괄호안에 넣는다
		System.out.println(i2); // 40
		String s4 = "1" + ( 2 + 3);
		System.out.println(s4); // 15
		
		// 문자열을 기본 타입으로 강제 타입 변환
		String s5 = "42";
		int i3 = Integer.parseInt(s5);
		// 문자열이 숫자가 아닌 알파벳이나 특수 문자, 한글 등을 포함하고 있는 경우
		// 숫자 타입 변환 시 예외(에러) 발생
		String s6 = "42a";
//		int i4 = Integer.parseInt(s6);
		
		// 반대로 기본 타입의 값을 문자열로 변경하는 경우
		String s7 = String.valueOf(3);
		System.out.println(s7);
	}

}
