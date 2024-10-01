package c06;

public class MethodName {
	// 메서드 이름
	// 자바 식별자(변수이름, 클래스이름) 규칙에 맞게 작성하면 된다.
	// 숫자로 시작하지 않고, $와_를 제외한 특수 문자를 사용하지 않는다.
	// 관례적으로 메사드 이름은 소문자로 시작
	// 서로 다른 단어가 혼합된 이름이라면 뒤에 오는 단어의 첫글자는 대문자
	
	// 클래스 이름
	// MethodName, Car, MyCar, Ride
	
	// 변수 이름
	// number, result, sum, model, name, age, numArr
	
	// 메서드 이름(동사로 시작)
	// run, startEngine, getName, getScores
	
	// 매개변수 선언
	// 매개변수는 메서드가 실행할 때 필요한 데이터를 외부로부터 받기위해 사용
	// 메서드에서 매개변수가 필요한 경우가 있고 없는 경우가 있다.
	// 메서드를 호출할 때 매개변수의 수와 타입을 잘 맞추자 
	double divide(int x, int y) {
		double result = (double) x / y;
		return result;
	}
	
	int getIntNum(int x) {
		int intNum = x;
		return intNum;
	}
	
	public static void main(String[] args) {
		MethodName mn = new MethodName();
		// 매개 값은 반드시 매개변수의 타입에 맞는 값이어야 한다.
		// divede() 메서드가 int 타입 매개 변수를 가지고 있다면
		// 호출 시 매개 값으로 int값이나 int타입으로 변환될 수 있는 값을 넘겨주어야 한다.
		mn.divide(10, 3);
		
		// 변수를 활용
		int x = 9;
		mn.divide(x, 8);
		// 자동 형 변환 활용
		byte b1 = 10;
		byte b2 = 20;
		mn.divide(b1, b2);
		// 메서드 활용
		mn.divide(mn.getIntNum(x), b2);
	}
}
