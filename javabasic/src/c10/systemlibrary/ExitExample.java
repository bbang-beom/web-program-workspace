package c10.systemlibrary;

// System 클래스
// 자바 프로그램은 운영체제에서 바로 실행되는 것이 아니라 JVM위에서 실행되기 때문에 
// 운영체제의 모든 기능을 직접 사용하기는 어렵다.
// 하지만 java.lang 패키지에 있는 System 클래스를 사용하면 운영체제의 일부 기능을 사용할 수 있다. 
// (프로그램 종료, 키보드로부터 입력, 모니터로 출력, 현재시간 읽기 등..)
// System 클래스의 모든 필드와 메서드는 정적(static)필드와 정적(static)메서드로 구성되어 있다.
public class ExitExample {
	public static void main(String[] args) {
		// 프로그램 종료(exit())
		// exit() 메서드는 현재 실행하고 있는 프로세스를 강제 종료한다.
		// exit() 메서드는 int 매개 값을 지정하고, 정상 종료 시 일반적으로 0값을 준다.
		for(int i = 0; i < 10; i++) {
			if(i == 5) {
//				break;
//				System.exit(0);
			}
		}
		System.out.println("마무리 코드");
		
		// 현재 시각 읽기(currentTimeMillis(), nanoTime())
		// System 클래스의 currentTimeMillis() 메서드와 nanoTime() 메서드는 
		// 컴퓨터의 시계로 부터 현재 시간을 읽어서 
		// millisecond(1/1000초), nanosecond(1/10^9초) 단위의 long 값 리턴
		// 주로 프로그램 시작 시각과 끝난 시각을 읽어 차이를 구하여 차이를 구해 프로그램 실행 소요 시간 측정에 사용된다.
	
		// for문을 사용해서 1부터 1000000까지의 합을 구하는데 걸린 시간
		long startTime = System.nanoTime();
		int sum = 0;
		for (int i = 1; i <= 1000000; i++) {
			sum += i;
		}
		long endTime = System.nanoTime();
		System.out.println("걸린 시간: " + (endTime - startTime));
	}
}
