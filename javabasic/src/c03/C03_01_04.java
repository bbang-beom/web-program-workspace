package c03;

public class C03_01_04 {

	public static void main(String[] args) {
		 /*
		 	논리 연산자
		 	논리곱(and): &&, & -> ~와
		 	연산식/결과 -> 피연산자 모두가 true일 경우에만 결과가 true
			true && true: true
			true && false: false
			false && true: false
			false && fasle: false

			논리합(or): ||, | -> ~또는
			연산식/결과 -> 피연산자 중 하나라도 true 면 true
			true || true: true
			true || false: true
			false || true: true
			false || fasle: false
			
			&&(||) 와 &(|) 차이
			&&(||)는 앞의 피연산자가 false면 뒤의 피연산자 연산 없이 false 반환
			&(|)는 두 피연산자 모두 연산 후 결과 반환
			
			논리 부정(not): ! -> 피연산자의 논리 값을 바꿈
		  */

		int num1 = 42;
		System.out.println(num1 < 10 && num1 < 50);
		
		// 10보다 크거나 20보다 작다
		int num2 = 15;
		System.out.println(num2 > 10 && num2 < 20);
		boolean b1 = num2 > 10 && num2 < 20;
		System.out.println(b1);
		
		// 20보다 크거나 30보다 작다
		int num3 = 40;
		System.out.println(num3 > 20 && num3 < 30);
		System.out.println((num3 > 20) && (num3 < 30));
		
		// 2 또는 3의 배수
		int num4 = 6;
		System.out.println(num4 % 2 == 0); // 2의 배수
		System.out.println(num4 % 3 == 0); // 3의 배수
		// 2 또는 3의 배수
		System.out.println(num4 % 2 == 0 || num4 % 3 == 0);
		System.out.println((num4 % 2 == 0) || (num4 % 3 == 0));
		System.out.println(!(num4 % 2 == 0 || num4 % 3 == 0));
		
		// 대입 연산자
		// 단순 대입 연산자(=): 오른쪽 피연산자의 값을 왼쪽 피연산자에 저장
		// 복합 대입 연산자(+=, -=, *=, /=, %=): 정해진 연산을 수행한 후 결과를 변수에 저장
		int num5 =42;
		num5+=1; //num5=num5+1
		System.out.println(num5);
		num5+=10; //num5=num5+10
		System.out.println(num5);
		//대입 연산자는 모든 연산자들 중에서 가장 낮은 연산 순위를 가지고 있다
	}

}
