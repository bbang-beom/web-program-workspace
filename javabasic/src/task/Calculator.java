package task;

public class Calculator {

	public static void main(String[] args) {

	}
	
	class Calculator1 {
		public void calculator1() {
			char c1 = 'a';
//		char c2 = c1 + 1; // c1은 char 타입 c2는 int 타입으로 타입이 달라 연산 불가(error 발생)
			char c2 = (char)(c1 + 1); // char 타입으로 타입 변환시 연산 가능
			System.out.println(c2);
		}
	}
	
	class Calculator2 {
		public void calculator2() {
		int x = 5;
		int y = 2;
		int result = x / y; // int 타입끼리의 연산 결과는 int 타입
		System.out.println(result);
		}
	}
	
	class Calculator3 {
		public void calculator3() {
			int x = 5;
			int y = 2;
			double result = (double)(x / y); // x / y 의 결과를 double 타입을 타입 변환
			System.out.println(result);
		}
	}
	class Calculator4 {
		public void calculator4() {
			double var1 = 3.5;
			double var2 = 2.7;
			int result =  (int)(var1 + var2);// (var1 + var2)의 결과를 int 타입으로 타입 변환 시 정수로 표현(소수점 버려짐)
		}
	}
	class Calculator5 {
		public void calculator5() {
			long var1 = 2L;
			float var2 = 1.8f;
			double var3 = 2.5;
			String var4 = "3.9";
			int result = (int)(var1 + var2 + (int)var3 + Double.parseDouble(var4));
			// 2 + 1.8 + 2.5 + 3.9 = 10.2이므로 한 변수 값의 소수점을 버리고(한 변수를 먼저 int로 변환)
			// var1~var4 를 더한 뒤 int로 변환하면 result에 9 저장
			System.out.println(result);
		}
	}
	class Calculator6 {
		public void calculator6() {
			String str1 = 2 + 3 + ""; // 5 숫자 먼저 계산 후 문자열 결합
			String str2 = 2 + "" + 3; // 23 문자열이 숫자 사이에 있어서 문자열 결합
			String str3 = "" + 2 + 3; // 23 문자열이 앞에 있어서 문자열 결합
			System.out.println(str1);
			System.out.println(str2);
			System.out.println(str3);
		}
	}
	
	class Calculator7 {
		public void calculator7() {
			// String은 기본 타입이 아닌 클래스 타입이므로 기본 타입의 타입 변환 방식 사용 불가
			// 각 기본 타입의 Byte, Integer, Float, Double를 호출하여 타입 변환 메서드 호출
			byte byteValue = Byte.parseByte("10");
			int intValue = Integer.parseInt("1000");
			float floatValue = Float.parseFloat("20.5");
			double doubleValue = Double.parseDouble("3.141592");
		}
	}
}
