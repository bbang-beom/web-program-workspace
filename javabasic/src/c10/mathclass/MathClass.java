package c10.mathclass;

// Math 클래스
// java.lang.Math 클래스는 수학 계산에 사용할 수 있는 메서드를 제공한다.
// Math 클래스가 제공하는 메서드는 모두 정적(static) 메서드이므로 Math 클래스로 바로 사용 가능하다.
public class MathClass {
	public static void main(String[] args) {
		// 절대값
		// int abs(int a), double abs(double a)
		int intNum1 = Math.abs(-5);
		double doubleNum1 = Math.abs(-3.14);
		System.out.println(intNum1);
		System.out.println(doubleNum1);

		// 소수점 올림
		// double ceil(double a)
		double doubleNum2 = Math.ceil(5.3); // 6.0
		double doubleNum3 = Math.ceil(-5.3); // -5.0
		System.out.println("doubleNum2 = " + doubleNum2);
		System.out.println("doubleNum3 = " + doubleNum3);

		// 소수점 버림
		// double floor(double a)
		double doubleNum4 = Math.ceil(5.3); // 6.0
		double doubleNum5 = Math.ceil(-5.3); // -5.0
		System.out.println("doubleNum4 = " + doubleNum4);
		System.out.println("doubleNum5 = " + doubleNum5);

		// 소수점 반올림
		// double round(double a)
		// round()메서드는 항상 소수점 첫째 자리에서 반올림해서 정수 값 리턴
		// 원하는 자리수에서 반올림 하려면 반올림 하려는 자릿수가 첫째 자릿수가 되도록 10^n을 곱한 후
		// round()값 리턴 후 10.0^n을 나눠주면 된다.
		double doubleNum6 = 12.3456;
		double temp1 = doubleNum6 + 100;
		long temp2 = Math.round(temp1);
		double doubleNum7 = temp2 / 100.0; // 1.12
		System.out.println("doubleNum7 = " + doubleNum7);
		
		// 랜덤한 숫자 뽑기 Math.random()
		// 랜덤한 정수를 범위 내에서 뽑기
		// (Math.random()*범위) + 시작점
		// 주사위 번호 뽑기
		int dice = (int)(Math.random() * 6) + 1;
		System.out.println(dice);
		// 로또 번호 뽑기
		int rotto = (int)(Math.random() * 45) + 1;
		System.out.println(rotto);
	}
}
