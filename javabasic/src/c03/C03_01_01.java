package c03;

public class C03_01_01 {

	// 연산자와 연산식
	// 연산자: 연산에 사용되는 표시나 기호
	// 피연산자: 연산자에 의해 연산되는 데이터
	// 연산식: 연산자와 피연산자를 이용하여 연산의 과정을 기술한 것
	public static void main(String[] args) {
		int i = 1 * 2 + 3;
		// 연산자 종류
		// 연산자는 필요로 하는 피연산자의 수에 따라 단항, 이항, 삼항 연산자로 구분
		
		//단항 연산자
		//부호 연산자(+,-)
		int i1 = +100;
		int i2 = -100;
		double d1 = +3.14;
		double d2 = -3.14;
		
		// +연산자는 변수 값의 부호를 유지
		// -연산자는 변수 값의 부호를 바꿈(+ -> -),(- -> +)
		// 부호 연산자는 정수 및 실수 타입 변수 앞에도 붙일 수 있다.
		// 값의 부호를 유지하거나 바꾸기 위해 사용
		int x = -100;
		int r1 = +x;
		int r2 = -x;
		System.out.println(r1);
		System.out.println(r2);
		
		// 부호 연산자의 결과는 int 타입
		byte b = 100;
//		byte b1 = -b; // error 발생
		int r3 = -b;
		
		// 증감 연산자(++, --)☆☆☆: 변수의 값을 1만큼 증가(++) 감소(--) 시키는 연산자
		// boolean 타입을 제외한 모든 기본 타입에 사용 가능
		// 연산식/설명
		// ++피연산자/다른 연산을 수행하기 전에 피연산자의 값을 1 증가
		// --피연산자/다른 연산을 수행하기 전에 피연산자의 값을 1 감소
		// 피연산자++/다른 연산을 수행한 후 피연산자의 값을 1 증가
		// 피연산자--/다른 연산을 수행한 후 피연산자의 값을 1 감소
		
		// ++연산자(증가연산자)는 피연산자의 값에 1을 더해서 다시 피연산자에 저장
		int num1 = 5; 
		++num1; // num1 = num1 + 1;
		
		// --연산자(감소연산자)는 피연산자의 값에 1을 빼서 다시 피연산자에 저장 
		int num2 = 5; 
		--num2; // num1 = num1 - 1;
		
		int num3 = 5;
		++num3;
		++num3;
		--num3;
		System.out.println(num3);
		
		int num4 = 5;
		System.out.println(++num4); // 6 
		System.out.println(num4++); // 6 
		System.out.println(num4); // 7 
		System.out.println(num4--); // 7 
		System.out.println(--num4); // 5
		
		// 논리 부정 연산자(!) not: boolean 타입의 true를 false로, false를 true로 변경
		boolean b1 = true;
		boolean b2 = false;
		System.out.println(!b1); // false
		System.out.println(!b2); // true
		
		// 논리 부정 연산자는 조건문과 제어문에서 조건식의 값을 바꿔 실행 흐름을 제어할 때 주로 사용
		if(true) {
			//()안의 값이 true면 실행되는 블록
		}
		else {
			//()안의 값이 false면 실행되는 블록
		}
		
		int num5 =5;
		boolean b3 = num5 < 3; // false
		if(!b3) { // true
			// else 대신 부정으로 조건문 실행 가능
			System.out.println("b3는 3보다 작다");
		}
		//두 가지 상태(true/false)를 번갈아가며 변경하느 토글(toggle)기능을 구현할 때도 사용
		boolean play = true;
		play = !play; 
		System.out.println(play); // false
		play = !play; 
		System.out.println(play); // true
	}
}
