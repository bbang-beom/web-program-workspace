package task.computerfield;

public class Computer {
	private Keyboard keyboard = new Leopord();
//	private Keyboard keyboard = new Corsair();
	
	void put() {
		keyboard.put();
	}
	
	public static void main(String[] args) {
		Computer computer = new Computer();
		computer.put();
	}
}
