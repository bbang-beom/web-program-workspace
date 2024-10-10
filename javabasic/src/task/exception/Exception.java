package task.exception;

public class Exception {
	// 4번 문제
	public static void main(String[] args) {
		String[] strArray = {"10", "2a"};
		int value = 0;
		for(int i = 0; i <= 2; i++) {
			try {
				value = Integer.parseInt(strArray[i]);
			} catch(ArrayIndexOutOfBoundsException e) {
				System.out.println("index 초과");
			} catch(NumberFormatException e) {
				System.out.println("숫자 변환 불가");
			} finally {
				System.out.println("value");
			}
		}
	}
	// 결과
	/*
	value
	숫자 변환 불가
	value
	index 초과
	value
	 */
}

class task1 {
	// 1번. try-catch-finally 블록에 대한 설명
	// try {} 블록에는 예외가 발생할 수 있는 코드를 작성한다.
	// catch {} 블록은 try{} 블록에서 발생한 예외를 처리하는 블록이다.
	// try {} 블록에서 return 문을 사용하면 finally {}블록은 실행되지 않는다. 
	// (x) finally {}블록은 try-catch문의 결과와 상관없이 예외처리 후 실행되는 블록
	// catch {} 블록은 예외의 종류별로 여러 개를 작성할 수 있다.
}

class task2 {
	// 2번. throws에 대한 설명
	// 생성자나 메서드의 선언 끝 부분에 사용되어 내부에 발생되니 예외를 떠넘긴다.
	// throws 뒤에는 떠넘겨야 할 예외를 쉼표(,)로 구분해서 기술한다.
	// 모든 예외를 떠넘기기 위해 간단하게 throws Exception으로 작성할 수 있다.
	// 새로운 예외를 발생시키기 위해 사용된다. (X)
	// 예외 처리를 떠넘기기 위한 키워드이다.
}

class task3 {
//	public void method1() throws NumberFormatException, ClassNotFoundException {
//		
//	}
//	 // 1
//	try {
//		method1();
//	}catch(Exception e) {
//	}
	
//	// 2
//	void method2() throws Exception {
//		method1();
//	}
//	
	// 3 (X) Exception은 최상위 예외 처리 클래스로 가장 아래 쪽에 있어야 한다.
//	try {
//		method1();
//	}catch(Exception e) {
//		
//	} catch(ClassNotFoundException e) {
//		
//	}
	
	// 4
//	try {
//		method1();
//	} catch(ClassNotFoundException e) {
//		
//	} catch(NumberFormatException e) {
//		
//	}
}
