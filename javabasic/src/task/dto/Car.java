package task.dto;

public class Car {
	private String name;
	private String color;
	private int maxSpeed;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public int getMaxSpeed() {
		return maxSpeed;
	}
	public void setMaxSpeed(int maxSpeed) {
		this.maxSpeed = maxSpeed;
	}
	
	@Override
	public String toString() {
		return "Car [name=" + name + ", color=" + color + ", maxSpeed=" + maxSpeed + "]";
	}
	
	public static void main(String[] args) {
		Car car1 = new Car();
		car1.setName("소나타");
		car1.setColor("흰색");
		car1.setMaxSpeed(250);
		Car car2 = new Car();
		car2.setName("아반떼");
		car2.setColor("회색");
		car2.setMaxSpeed(240);
		Car car3 = new Car();
		car3.setName("제네시스");
		car3.setColor("검정색");
		car3.setMaxSpeed(260);
		
		Car[] carArr = new Car[10];
		carArr[0] = car1;
		carArr[1] = car2;
		carArr[2] = car3;
		
		for(int i = 0; i < 3; i++) {
			System.out.println(carArr[i].toString());
		}
	}
}
