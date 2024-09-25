package c02;

public class C02_02_01 {

	// 파이썬
	// x = 0
	// 자바 스크립트
	// let x = 0
	// const y = 1
	
	// 기본 타입
	// 변수를 선언할 때 주어지는 타입에 따라 
	// 변수에 저장할 수 있는 값의 종류와 허용 범위가 달라진다
	
	// 타입 구분/저장되는 값에 따른 분류/ 타입의 종류
	// 기본타입/정수 타입/byte, char, short, int, long
	// 기본타입/실수 타입/float, double
	// 기본타입/논리 타입/boolean
	
	// 정수 타입
	// 타입/메모라 사용 크기/1byte==8bit
	// byte/1byte/8bit
	// short/2byte/16bit
	public static void main(String[] args) {
		int varName;
		String strName;
		byte b;
		char c;
		short s;
		int i;
		long l;
		// 정수 타입으로 선언된 변수에는 정수 리터럴을 대입해서 정수를 저장할 수 있다.
		// *리터럴: 소스 코드에서 프로그래머에 의해 직접 입력된 값
		byte b3 = 127; // 127 -> 리터럴
		
		// 입력된 리터럴 중에서 자바가 정수로 인식하는 경우
		// 10진수: 소수점이 없는 0~9 숫자
		int decimal = 12;
		
		// 2진수: 0b 또는 0B로 시작하고 0과 1로 구성
		int binary = 0b1011;
		
		// 8진수: 0으로 시작하고 0~7숫자로 구성
		int octal = 013;
		
		// 16진수: 0x또는 0X로 시작하고 0~9숫자와 A~F 또는 a~f로 구성
		int hexdecimal = 0xB3;
		
		// 기본저그올 컴파일러는 정수 리터럴을 int 타입으로 간주
		System.out.println(21000000);
		// 리터럴이 long 타입임을 컴파일러에게 알려주려면 리터럴 뒤에 l 이나 L을 붙인다.
		long balance1 = 201000000l;
		long balance2 = 201000000L;
		
		//long타입 변수에 정수 리터럴을 저장할 때 int 타입의 허용 범위 이내라면 L을 붙이지 않아도 된다.
		long balance3 = 120;
		
		
	}
}
