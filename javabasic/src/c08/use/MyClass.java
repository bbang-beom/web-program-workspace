package c08.use;

import c08.RemoteControl;
import c08.Television;

// 인터페이스 사용
// 인터페이스는 필드, 생성자 또는 메서드의 매개 변수나 로컬 변수로 선언될 수 있다.
public class MyClass {
	RemoteControl rc;
	RemoteControl rc1 = new Television();
	
	public RemoteControl getRc() {
		return rc;
	}

	public RemoteControl getRc1() {
		return rc1;
	}

	public MyClass() {
		
	}
	
	public MyClass(RemoteControl rc) {
		this.rc = rc;
	}
	
	public void methodA() {
		// 로컬 변수로 선언된 인터페이스
		RemoteControl rc = new Television();
		rc.turnOn();
		rc.turnOff();
	}
	
	public void methodB(RemoteControl rc) {
		// 메서드의 매개 변수 타입으로 선언된 인터페이스
		rc.turnOn();
		rc.turnOff();
	}
	
	public static void main(String[] args) {
		// 필드로 선언된 rc1
		MyClass myClass = new MyClass();
		myClass.getRc1().turnOn();
		myClass.getRc1().setVolume(33);
		
		// 생성자의 매개 변수 타입으로 선언된 rc
		MyClass myClass1 = new MyClass(new Television());
		myClass1.getRc().turnOn();
		myClass1.getRc().turnOff();
		
	}
	 
}
