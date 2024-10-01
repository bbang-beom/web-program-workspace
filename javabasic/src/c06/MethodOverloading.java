package c06;

// 메서드 오버로딩
// 다양한 매개 값을 처리하기 위해 클래스 내에 같은 이름의 메서드를 매개변수의 타입, 개수, 순서 중 
// 하나 이상 다르게 하여 여러 개 선언하는 것
public class MethodOverloading {
	
	int plus(int x, int y) {
		return x + y;
	}
	
	double plus(double x, double y) {
		return x + y;
	}
	// 매개 변수의 타입과 개수, 순서가 같을 경우 
	// 단순히 매개 변수 이름이 다르다고 해서 메서드 오버로딩이라 하지 않는다.
	// 리턴 타입만 다른 것도 오버로딩이 아니다.
//	double plus(double x2, double y2) {
//		
//	}
	
	public static void main(String[] args) {
		System.out.println(3);
		System.out.println("문자열");
		
		MethodOverloading mo = new MethodOverloading();
		mo.plus(10, 42);
		mo.plus(10.0, 4.5);
		//잋라적으로 매개 변수의 타입을 본다.
		mo.plus(10, 20.3);
		
	}
}
