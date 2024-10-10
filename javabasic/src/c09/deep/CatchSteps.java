package c09.deep;

import java.util.Scanner;


public class CatchSteps {
	public static void main(String[] args) {
		// catch 순서
		// 다중 catch 블록을 작성할 때 상위 예외 클래스가 하위 예외 클래스보다 아래쪽에 위치해야 한다.
		// try 블록에서 예외가 발생하면, catch 블록은 위에서부터 차례대로 검색된다. 
		// 만약 상위 예외 클래스의 catch 블록이 위에 있다면, 하위 클래스의 catch 블록은 실행되지 않는다.
		// 하위 예외 클래스는 상위 예외 클래스를 상속했기 때문에 상위 예외 타입으로도 예외 처리가 가능하기 때문이다.
		Scanner scanner = new Scanner(System.in);
		try {
			String[] str = {"안녕하세요", "Hello", "こんにちは"};
			System.out.println("인사를 선택하세요");
			System.out.println("1.한국어 2.영어 3.일본어");
			System.out.print("선택: ");
			int choice = Integer.parseInt(scanner.nextLine());
			System.out.println(str[choice-1]);
			// 모든 예외 클래스는 Exception을 상속받기 때문에 첫 번째 catch 블록만 선택되어 실행
			// 이후 catch 블록은 어떤 경우에도 실행되지 않는다.
//		} catch(Exception e) {
//			System.out.println("알 수 없는 에러"); // (아래 예외 처리 블록 사용 불가)
		} catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("index 범위 초과");
		} catch(NumberFormatException e) {
			System.out.println("잘못된 입력");
		}
		scanner.close();
	}
}
