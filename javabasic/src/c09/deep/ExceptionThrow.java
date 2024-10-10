package c09.deep;

// 예외 떠넘기기
// 메서드 내부에서 예외가 발생할 수 있는 코드를 작성할 때 일반적으로 try-catch 블록으로 예외를 처리하지만,
// throws를 사용해 메서드를 호출한 곳으로 예외를 떠넘기는 경우도 있다.
// throws 키워드는 메서드 선언부 끝에 작성되어 메서드에서 처리하지 않은 예외를 호출한 곳으로 넘긴다.
// throws 키워드 뒤에는 넘길 예외 클래스들을 작성하여 사용한다.
// 리턴타입 메서드이름(매개변수,...) throws 예외 클래스1, 예외 클래스2, ...{}
// 일반적으로 throws뒤에 발생하는 예외들을 작성하지만, throws Exception만으로 모든 예외를 넘길 수도 있다.
// 리턴타입 메서드이름(매개변수,...) throws Exception{}
public class ExceptionThrow {
	public void method1() throws ClassNotFoundException{
		Class clazz = Class.forName("java.lang.Throwable2");
	}
	
//	public void method2() throws ClassNotFoundException{
	public void method2() {
		try {			
			method1();
		}catch(ClassNotFoundException e) {
			System.out.println(e.getMessage());
		}
	}
	public static void main(String[] args) {
		ExceptionThrow et = new ExceptionThrow();
		et.method2();
		System.out.println("end");
	}
	// method1() 메서드는 예외를 넘겼고, method2()에서 예외 처리를 하였다.
	// main()메서드에서도 throws 키워드를 사용해 예외를 넘길 수 있지만, 결국 JVM이 최종적으로 예외를 처리한다.
	// JVM은 예외의 내용을 콘솔에 출력하고 종료함으로써 예외를 처리한다.
	// 때문에, main() 메서드에서 throws를 붙이는 건 좋지 않은 예외 처리 방법이다.
}
