package c03;

public class C03_01_02 {

	public static void main(String[] args) {
		// 이항 연산자: 피연산자가 2개인 연산자
		// 산술 연산자, 문자열 결합 연산자, 비교 연산자, 논리 연산자, 대입 연산자
		// 산술 연산자
		//연산식/설명
		//+: 덧셈, -: 뺄셈, *: 곱셈, /: 나눗셈, %: 나머지
		
		// 나머지 연산
		int num1 = 10;
		int result1 = num1 % 3;
		System.out.println(result1); // 1
		
		// 산술 연산자는 피연산자들의 타입이 동일하지 않을 경우 피연산자들의 타입을 일치 시킨 후 연산을 수행
		// 1. byte, short, char 타입: 모두 int 타입으로 변환 후 연산
		// 2. 모두 정수 타입이고 long 타입이 포함되어 있는 경우: 모두 long 타입으로 변환 후 연산
		// 3. 실수 타입(float, double)이 있는 경우: 허용 범위가 큰 실수 타입으로 변환 후 연산
		
		int v1 = 3;
		int v2 = 1;
		
		int r1 = v1 + v2;
		System.out.println(r1);
		
		int r2 = v1 - v2;
		System.out.println(r2);
		
		int r3 = v1 * v2;
		System.out.println(r3);
		
		int r4 = v1 / v2;
		System.out.println(r4);
		
		int r5 = v1 % v2;
		System.out.println(r5);
		
		double r6 = (double)v1 / v2;
		System.out.println(r6);
		
		//char 타입의 산술 연산
		char c1 = 'A';
		System.out.println(c1); // A
		
		char c2 = 65;
		System.out.println(c2); // A
		
		char c3 = (char)(c2+1); 
		System.out.println(c3); // B
		}

}
