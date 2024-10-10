package c09.deep;

import java.util.Scanner;

// 예외 종류에 따른 처리 코드
// 예외의 종류에 따른 예외 처리 코드 작성 방법

// 다중 catch
// try 블록 내부는 다양한 예외가 발생한다. 예외 별로 예외 처리 코드를 다르게 하기위해 다중 catch 블록을 사용한다.

public class CatchMulti {
	public static void main(String[] args) {
		// catch 블록의 예외 클래스 타입은 try 블록에서 발생한 예외의 종류를 말한다. 
		// try 블록에서 예외가 발생하면 해당 타입의 catch 블록을 실행한다.
		// catch 블록을 여러 개 작성하여도 하나의 catch 블록만 실행된다. 
		// try 블록에서 예외가 발생하면 즉시 실행을 멈추고 해당 catch 블록으로 이동한다.
		Scanner scanner = new Scanner(System.in);
		try {
			String[] str = {"안녕하세요", "Hello", "こんにちは"};
			System.out.println("인사를 선택하세요");
			System.out.println("1.한국어 2.영어 3.일본어");
			System.out.print("선택: ");
			int choice = Integer.parseInt(scanner.nextLine());
			System.out.println(str[choice-1]);
		} catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("index 범위 초과");
		} catch(NumberFormatException e) {
			System.out.println("잘못된 입력");
		}
		scanner.close();
	}
}
