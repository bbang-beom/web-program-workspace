package task.computerparam;

public class Computer {
	public void putKeyboard(Keyboard keyboard) {
		keyboard.put();
	}
	
	public static void main(String[] args) {
		Computer computer = new Computer();
		computer.putKeyboard(new Leopord());
		computer.putKeyboard(new Corsair());
		Leopord leopord = new Leopord();
		computer.putKeyboard(leopord);
		Corsair corsair = new Corsair();
		computer.putKeyboard(corsair);
	}
}
