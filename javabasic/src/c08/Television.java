package c08;

// 인터페이스 구현
// 인터페이스에서 정의된 추상 메서드와 동일한 메서드 이름, 매개 타입, 리턴 타입을 가지고있는
// 실체 메서드를 가지고 있어야 한다.

// 구현 클래스
// 인터페이스 구현을 위한 implements 키워드를 추가하고 구현할 인터페이스 이름을 명시한 클래스
// 인터페이스에 선언된 추상 메서드의 실체 메서드를 선언해야 한다.
public class Television implements RemoteControl{
	
	@Override
	public void turnOn() {
		System.out.println("전원 ON");
	}

	@Override
	public void turnOff() {
		System.out.println("전원 OFF");
	}

	@Override
	public void setVolume(int volume) {
		System.out.println("현재 TV 볼륨: " + volume);
	}
	
	public static void main(String[] args) {
//		RemoteControl rc = new RemoteControl();
		Television t = new Television();
		t.turnOn();
		t.setVolume(50);
		t.turnOff();
		
		// 일반적으로 인터페이스 변수에 구현 객체를 대입해서 사용한다.
		RemoteControl rc = new Television();
	}
	
}
