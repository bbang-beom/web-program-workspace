package c09.deep;

// Throwable 클래스
// java.lang.Throwable 클래스
// 모든 예외 클래스의 최상위 클래스
// Throwable 클래스의 두 가지 메서드
// public String getMessage(): 예외의 원인을 담고 있는 문자열 반환
// public void printStackTrace(): 예외가 발생한 위치와 호출된 메서드의 정보를 출력
public class ThrowableClass {
	public static void main(String[] args) {
		int[] intArray = {1, 2, 3};
		try {
			System.out.println(intArray[3]);
		}catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("배열 index 초과");
			System.out.println(e.getMessage());
		}finally {
			System.out.println("try catch 블록 실행 끝");
		}
		System.out.println("end");
	}
}
