package task;

public class casting {

	public static void main(String[] args) {

	}
	
	class casting1 {
		byte byteValue = 10;
		char charValue = 'A';
		
		int intValue = byteValue;  // int가 byte보다 허용범위가 커 자동 타입 변환
		int intValue2 = charValue;     // 정수 리터럴로 변환할 때 컴파일러는 int 타입을 간주
//		short shortValue = charValue; // 정답: 3 정수 리터럴로 변환할 때 컴파일러는 int 타입을 간주
		double doubleValue = byteValue; // double이 byte보다 허용범위가 커 자동 타입 변환
	}
	
	class castring2 {
		int intValue = 10;
		char charValue = 'A';
		double doubleValue = 5.7;
		String strValue = "A";
		
		double doubleVar = (double)intValue; // casting 연산자 없어도 되지만 컴파일 error 발생은 없음
		byte byteVar = (byte)intValue; // 정상적인 강제 형변환
		int intVar = (int)doubleValue; // 정상적인 강제 형변환
//		char charVar = (char)strValue; // 정답: 4 String은 기본타입이 아닌 클래스 타입 컴파일 에러 발생
	}
	
	class casting3 {
		byte byteValue = 10;
		float floatValue = 2.5F;
		double doubleValue = 2.5;
		
//		byte byteResult = byteValue + byteValue; //정답: 1 byte 변수는 연산 시 int로 자동 변환
		int intResult = 5 + byteValue; // 정상적인 연산(int)
		float floatResult = 5 + floatValue; // 정상적인 연산(float)
		double doubleResult = 5 + doubleValue; // 정상적인 연산(double)
	}
	
	class casting4 {
		short s1 = 1;
		short s2 = 2;
		int i1 = 3;
		int i2 = 4;
//		short shortResult = s1 + s2; // error 발생 short 변수는 연산 시 int로 자동 변환
		int intResult = i1 + 12;
	}
}
