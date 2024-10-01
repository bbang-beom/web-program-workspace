package c06;

public class Calculator {
	// 메서드 작성
	void powerOn() {
		System.out.println("전원 ON");
	}
	
	int plus(int x, int y) {
		int result = x + y;
		return result;
	}
	
	double divide (int x, int y) {
		double result = (double) x / y;
		return result;
	}
	
	void powerOff() {
		System.out.println("전원 OFF");
	}
	
	public static void main(String[] args) {
		Calculator c = new Calculator();
		c.powerOn();
		System.out.println(c.plus(5, 6));
		System.out.println(c.divide(10, 4));
		c.powerOff();
	}
}
