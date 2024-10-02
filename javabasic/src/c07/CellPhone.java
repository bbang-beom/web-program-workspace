package c07;

public class CellPhone {
	private String model;
	private String color;
	
	public String getModel() {
		return model;
	}
	public void setModel(String model) {
		this.model = model;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	
	public void powerOn() {
		System.out.println("전원 ON");
	}
	
	public void powerOff() {
		System.out.println("전원 OFF");
	}
	
	public void bell() {
		System.out.println("벨이 울림");
	}
	
	public void hangUp() {
		System.out.println("전화를 끊습니다.");
	}
}
