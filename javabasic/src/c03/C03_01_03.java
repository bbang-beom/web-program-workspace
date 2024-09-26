package c03;

public class C03_01_03 {

	public static void main(String[] args) {
		//문자열 결합 연산자(+): 피연산자 중 한쪽이 문자열이면 +연산자는 결합 연산자로 사용
        //                	다른 피연산자를 문자열로 변환하고 서로 결합
		int num1 = 42;
		System.out.println("임의의 숫자" + num1);
		
		int sugarMount = 4;
		System.out.println("설탕을" + sugarMount + "스푼 넣는다");
		
		// 비교 연산자(<, <=, >, >=, !=): 피연산자의 대소 or 동등을 비교해서 true/false 반환
		//연산식/설명
		//동등 비교 
		// ==: 두 피연산자의 값이 같은지 검사
		// !=: 두 피연산자의 값이 다른지 검사
		int num2 = 10;
		int num3 = 10;
		int num4 = 11;
		System.out.println(num2 == num3);
		System.out.println(num2 == num4);		
		System.out.println(num2 != num4);
		boolean b1 = num3 == num4;
		System.out.println(b1);
		
		// 크기 비교
		// >: 왼쪽 피연산자가 큰지 검사
		// >=: 왼쪽 피연산자가 크거나 같은지 검사
		// <: 왼쪽 피연산자가 작은지 검사
		// <=: 왼쪽 피연산자가 작거나 같은지 검사
		System.out.println(num3 > num4);
		System.out.println(num2 < num4);
		System.out.println(num2 >= num3);
		System.out.println(num3 <= num4);
		
		int v2 = 1;
		double v3 = 1.0;
		System.out.println(v2 == v3); // true double 타입으로 변환되어 비교
		
		// float과 비교 할 때는 피연산자를 모두 float 타입으로 변환해서 비교하거나 정수 타입으로 변환해서 비교
		double v4 = 0.1;
		float v5 = 0.1f;
		System.out.println(v4 == v5); // false
		System.out.println((float)v4 == v5); // true
		
		// String 변수 비교
		// String 변수를 비교할 때는 equals()메서드 사용
		String str1 = "검색어";
		String str2 = new String("검색어");
		System.out.println(str1);
		System.out.println(str2);
		System.out.println(str1 == str2); // false
		System.out.println(str1.equals(str2)); // true
	}
}
