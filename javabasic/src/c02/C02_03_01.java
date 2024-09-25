package c02;

public class C02_03_01 {

	// 타입 변환: 데이터 타입을 다른 데이터 타입으로 변환하는 것
	// ex) byte -> int, int -> byte
	public static void main(String[] args) {
		// 두 변수의 타입이 동일할 경우, 한쪽 변수 값을 다른 쪽 변수에 복사 저장 가능
		int n1 = 42;
		int n2 = n1;
		
		// 만약 두 변수의 타입이 다르다면, 값의 복사 저장이 불가능 할 수 있다.
		byte a = 10;
		int b = a;
		String c = "10";
//		b = c; // error
		
		// 자동 타입 변환
		// 자동 타입 변환은 값의 허용 범위가 작은 타입이 허용 범위가 큰 타입으로 저장될 때 발생
		// 기본 타입의 허용범위 크기: byte<short<int<long<float<double
		byte byteValue = 10;
		int Value = byteValue;
		// 정수 타입이 실수 타입으로 저장될 경우에는 무조건 자동 타입 변환이 된다.
		long longValue = 5000000000L;
		float floatValue = longValue;
		double doubleValue = longValue;
		
		//강제 타입 변환
		//강제 타입 변환은 캐스팅 연산자 괄호()를 사용
		int i3 = 10;
		byte b3 = (byte)i3;
		int i4 = 1000;
		byte b4 = (byte)i4;
//		System.out.println(b4); // -24 담을 수 없는 크기의 값을 강제 형변환(논리 에러)
		
		//실수 타입을 정수 타입으로 강제 타입 변환을 사용하면 
		//소수점 이하 부분은 버려지고 정수 부분만 저장
		double d5 = 3.14;
		int i5 = (int)d5;
		System.out.println(i5); // 3
		
		// 정수 연산에서 자동 타입 변환
		// byte, short 타입의 변수는 int 타입으로 자동 타입 변환되어 연산 수행
		byte b1 = 10;
		byte b2 = 20;
//		byte b3 = b1 + b2; // error 발생
		int iCasting = b1 + b2; // 정상 실행
		System.out.println(iCasting); // 30
		byte bCasting = (byte)(b1+b2);
		System.out.println(bCasting);
		
		// 다른 두 타입의 연산 시 허용 범위가 더 큰 타입으로 변환되어 연산 수행
		byte v1 = 10;
		int v2 = 100;
		long v3 = 1000L;
		long sum = v1 + v2 + v3; // 가장 큰 long으로 변환
		System.out.println(sum);
	}
}
