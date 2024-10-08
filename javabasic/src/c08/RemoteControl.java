package c08;

public interface RemoteControl {
	// public 접근 제한
	// 인터페이스의 모든 메서드는 public 접근 제한으로만 작성할 수 있다.
	public void turnOn();
	public void turnOff();
	public void setVolume(int volume);
}
