package c09;

// 예외 클래스
// 예외(exception)란 사용자의 잘못된 조작 또는 개발자의 잘못된 코딩으로 인해 발생하는 프로그램 오류
// 에러와 비슷하게 예외가 발생하면 프로그램은 종료된다.
// 이는 예외 처리를 통해 프로그램을 종료하지 않고 정상 실행 상태가 유지되도록 할 수 있다.
// 자바는 예외가 발생할 가능성이 높은 코드를 컴파일 할 때 예외 처리 유무를 확인하여,
// 예외 처리 코드가 없다면 컴파일 되지 않는다.

// 예외와 예외 클래스
// 예외는 일반 예외, 실행 예외 두가지 종류가 있다.
// 일반 예외는 체크 예외 라고도 하며, 프로그램 실행 시 예외가 발생할 가능성이 높기 때문에 
// 자바 소스를 컴파일 하는 과정에서 해당 예외 처리 코드가 있는지 검사하여 예외 처리 코드가 없다면 컴파일 오류가 발생한다.
// 실행 예외는 컴파일러 넌 체크 예외 라고도 하며, 실행 시 예측하지 못하게 발생하기 때문에 
// 컴파일하는 과정에서 예외 처리 코드가 있는지 검사하지 않는다.
// 자바에서는 예외를 클래스로 관리한다. VM은 프로그램을 실행하는 도중 예외가 발생하면 해당 예외 클래스로 객체를 생성한다.

public class ExceptionDetails {
	// 실행 예외
	// NullPointerException: 자바 프로그램에서 가장 빈번하게 발생하는 실행 예외
	// 객체 참조가 없는 상태, 즉 null값을 갖는 참조 변수로 객체 접근 연산자인 도트(.)를 사용했을 때 발생한다. 
	// 객체가 없는 상태에서 객체를 사용하려 하여 예외가 발생한 것
	
	public void printHello() {
		System.out.println("Hello");
	}
	
	public static void main(String[] args) {
		System.out.println("프로그램 시작");
		ExceptionDetails ed = null;
//		ed.printHello(); // NullPointerException 예외 발생
		// 프로그램에서 예외가 발생하면 consloe뷰에 예외 메시지가 출력되면서 프로그램 종료
//		System.out.println("프로그램 끝");
		
		// ArrayIndexOtuOfBoundsExceoption: 배열에서 index 범위를 초과할 경우 예외 발생
		int[] arr = {1, 2, 3};
		System.out.println(arr[0]);
//		System.out.println(arr[3]);
//		System.out.println("프로그램 끝");

		// NumberFormatException: 문자열을 숫자로 변환할 때 주로 아래와 같은 코드를 사용한다.
		String data = "100a";
//		int value = Integer.parseInt(data);
//		System.out.println("프로그램 끝");

		// ClassCastException: 클래스 타입 변환은 상위 클래스와 하위 클래스 간에 발생하고
		// 구현 클래스와 인터페이스 간에도 발생한다.
		// 이 외의 관계에서 타입 변환을 할 때 예외가 발생한다.
		Object obj = new ExceptionDetails();
		ExceptionDetails ed1 = (ExceptionDetails)obj;
		String str = (String)obj;
		
		System.out.println("프로그램 끝");
	}
}
