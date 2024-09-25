package c02;

public class C02_02_03 {
	
	public static void main(String[] args) {
		// 실수 타입: 소수점이 있는 수를 실수라고 한다.
		// 타입/메모리 사용 크기
		// float/4byte
		// double/8byte
		
		//	실수 리터럴: 소수점이 있는 숫자는 10진수 실수로 인식
		double d1 = 3.14;
		// 자바는 실수 리터럴을 기본적으로 double 타입으로 해석하기 때문에
		// double 타입 변수에 저장해야 한다.
		// float f = 3.14;
		// float 타입으로 저장하고 싶다면 리터럴 뒤에 f나 F를 붙인다.
		float f1 = 3.14f;
		float f2 = 3.14F;
		// 실수는 연산을 할 때 오차가 발생
		//float와 double은 정밀도 차이가 있는데 double의 정밀도가 더 높음
		double d2 = 0.1;
		double temp = 0;
		for(int i = 0; i <= 10; i++) {
			temp = temp + d2;
		}
		System.out.println(temp);
	}
}
