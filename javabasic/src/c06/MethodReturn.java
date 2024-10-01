package c06;

import java.util.Scanner;

public class MethodReturn {
	// 리턴(return)문
	// 리턴 값이 있는 메서드
	// 메서드 선언에 리턴 타입이 있는 메서드는 반드시 리턴문을 사용해서 리턴 값을 지정해야 한다.
	// 만약 return문이 없다면 컴파일 에러 발생
	// return 문이 실행되면 메서드 즉시 종료
	
	
	// return 리턴 값;
	// return문 리턴 값은 리턴 타입이거나 리턴 타입으로 변환될 수 있어야 한다.
	int plus(int x, int y) {
		return x + y;
//		int x + y; 
	}
	
	// 조건문을 활용하면 Unreachable code 에러를 발생 시키지 않고 return문 여러개 활용 가능
	boolean isGood(int good) {
		if(good == 0) {
			System.out.println("not good");
			return false;
		}
		System.out.println("good");
		return true;
	}
	
	//return 값이 없는 메서드(void)
	// void로 선언된 메서드에서도 return문 사용 가능
	// 리턴 값을 지정하는 것이 아니라 메서드 실행을 강제 종료하는 역할
	void divideWithZero(double a, double b) {
		if(b == 0) {
			System.out.println("0으로 나누는 것은 불가능");
			return;
		}
		double result = a / b;
		double rest = a % b;
		System.out.println("값: " + result);
		System.out.println("값: " + rest);
	}
	
	public static void main(String[] args) {
		MethodReturn mr = new MethodReturn();
		mr.isGood(0);
		mr.isGood(1);
		mr.divideWithZero(10, 2);
		mr.divideWithZero(8, 0);
	}
}
