package c09;

// 예외처리
// 프로그램에서 예외가 발생했을 때, 프로그램의 갑작스러운 종료를 막고 정상 실행을 유지할 수 있도록 예외 처리가 필요하다.
// 실행 예외는 컴파일러가 체크해주지 않기 때문에 테스트와 분석을 통해 개발자가 예외 처리 코드를 작성해야 한다.

// 예외 처리 코드
// try-catch-finally 블록은 실행 예외가 발생할 경우 예외 처리를 할 때 사용한다.
public class TryCatch {
	public static void main(String[] args) {
		// catch(예외 클래스 e){}
		// 모든 예외 클래스는 java.lang.Exception클래스를 상속받는다.
		try {
			// 예외 발생 가능한 코드
		}catch (Exception e) {
			// 예외 처리 코드
		}finally {
			// 항상 실행되는 코드
		}
		
		// 일반 예외
		// 컴파일러가 개발자에게 예외 처리 코드를 작성하도록 요구한다.
		// Class.forName() 메서드는 매개 값으로 주어진 클래스가 존재하면 Class 객체를 리턴하고, 
		// 존재하지 않다면 ClassNotFoundException 발생
		try {
			Class c1 = Class.forName("java.lang.String2");
		} catch (ClassNotFoundException e) {
			System.out.println("존재하지 않는 클래스");
		}
		System.out.println("프로그램 끝");
	}
}
