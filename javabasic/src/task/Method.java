package task;

import java.util.Scanner;

public class Method {
	final double PI = 3.14;
	Scanner scanner = new Scanner(System.in);
	// 두 수를 입력 받아 더한 값을 리턴 해주는 함수 만들기
	void Plus(int x, int y) {
		int plus = 0;
		plus = x + y;
		System.out.println("결과:" + plus);
	}
	// 두 수를 입력 받아 뺀 값을 리턴 해주는 함수 만들기
	void Minus(int x, int y) {
		System.out.println("뺄셈");
		int minus = 0;
		minus = x - y;
		System.out.println("결과:" + minus);
	}
	// 두 수를 입력 받아 곱한 값을 리턴 해주는 함수 만들기
	void Multiply(int x, int y) {
		int multiply = 0;
		multiply = x * y;
		System.out.println("결과:" + multiply);
	}
	// 두 수를 입력 받아 나눈 값을 리턴 해주는 함수 만들기
	void Divide(int x, int y) {
		double divide = 0.0;
		divide = (double)x / y;
		System.out.println("결과:" + divide);
	}
	// 두 수를 입력 받아 나머지 값을 리턴 해주는 함수 만들기
	void Rest(int x, int y) {
		int rest = 0;
		rest = x % y;
		System.out.println("결과:" + rest);
	}
	// 직사각형의 두변을 입력 받아 둘레는 리턴 해주는 함수
	void RectangleCircumperence(int x, int y) {
		int circumperence = 0;
		circumperence = 2 * (x + y);
		System.out.println("결과:" + circumperence);
	}
	// 직사각형의 두변을 입력 받아 넓이를 리턴 해주는 함수
	void RectangleArea(int x, int y) {
		int rectangleArea = 0;
		rectangleArea = x * y;
		System.out.println("결과:" + rectangleArea);
	}
	// 삼각형의 넓이와 높이를 입력 받아 넓이를 리턴 해주는 함수
	void TriangleArea(int x, int y) {
		double rectangleArea = 0;
		rectangleArea = (double)(x * y / 2);
		System.out.println("결과:" + rectangleArea);
	}
	// 원의 반지름을 입력 받아 넓이는 리턴 해주는 함수
	void CircleArea(int r) {
		double circleArea = 0;
		circleArea = Math.pow(r, 2) * PI;
		System.out.println("결과:" + circleArea);
	}
	// 정사각형의 한변을 입력 받아 넓이는 리턴 해주는 함수
	void SquareArea(int x) {
		int squareArea = 0;
		squareArea = (int)Math.pow(x, 2);
		System.out.println("결과:" + squareArea);
	}
	
	int InputIntX() {
		System.out.print("x입력: ");
		int x = Integer.parseInt(scanner.nextLine());
		return x;
	}
	
	int InputIntY() {
		System.out.print("y입력: ");
		int y = Integer.parseInt(scanner.nextLine());
		return y;
	}
	
	int InputIntRadius() {
		System.out.print("r입력: ");
		int r = Integer.parseInt(scanner.nextLine());
		return r;
	}
	
	public static void main(String[] args) {
		// 출력
		Scanner scanner = new Scanner(System.in);
		Method m = new Method();
		boolean run = true;
		while(run) {
			System.out.println("0.종료 | 1.덧셈 | 2.뺄셈 | 3.곱셈 | 4.나눗셈 | 5.나머지 | 6.직사각형 둘레 | "
					+ "7.직사각형 넓이 | 8.삼각형 넓이 | 9 원의 넓이 | 10.정사각형 넓이");
			System.out.print("함수 선택: ");
			int choice = Integer.parseInt(scanner.nextLine());
			switch (choice) {
			case 1:
				System.out.println("덧셈 "); 
				m.Plus(m.InputIntX(), m.InputIntY());
				break;
			case 2:
				System.out.println("뺄셈 ");
				m.Minus(m.InputIntX(), m.InputIntY());
				break;
			case 3:
				System.out.println("곱셈 ");
				m.Multiply(m.InputIntX(), m.InputIntY());
				break;
			case 4:
				System.out.println("나눗셈 ");
				m.Divide(m.InputIntX(), m.InputIntY());
				break;
			case 5:
				System.out.println("나머지 ");
				m.Rest(m.InputIntX(), m.InputIntY());
				break;
			case 6:
				System.out.println("직사각형 둘레 ");
				m.RectangleCircumperence(m.InputIntX(), m.InputIntY());
				break;
			case 7:
				System.out.println("직사각형 넓이 ");
				m.RectangleArea(m.InputIntX(), m.InputIntY());
				break;
			case 8:
				System.out.println("삼각형 넓이");
				m.TriangleArea(m.InputIntX(), m.InputIntY());
				break;
			case 9:
				System.out.println("원의 넓이 ");
				m.CircleArea(m.InputIntRadius());
				break;
			case 10:
				System.out.println("정사각형 넓이 ");
				m.SquareArea(m.InputIntX());
				break;
			case 0:
				System.out.println("종료");
				run = false;
				break;

			default:
				System.out.println("다른 보기 입력");
				break;
			}
		}
	}
}
