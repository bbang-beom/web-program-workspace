package task.dto;

public class Fruit {
	private String name;
	private String color;
	private int cost;
	
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
	public int getCost() {
		return cost;
	}
	public void setCost(int cost) {
		this.cost = cost;
	}
	
	@Override
	public String toString() {
		return "Fruit [name=" + name + ", color=" + color + ", cost=" + cost + "]";
	}
	
	public static void main(String[] args) {
		Fruit f1 = new Fruit();
		f1.setName("apple");
		f1.setColor("red");
		f1.setCost(3000);
		Fruit f2 = new Fruit();
		f2.setName("banana");
		f2.setColor("yellow");
		f2.setCost(5000);
		Fruit f3 = new Fruit();
		f3.setName("orange");
		f3.setColor("orange");
		f3.setCost(7000);
		
		Fruit[] fruitArray = new Fruit[10];
		fruitArray[0] = f1;
		fruitArray[1] = f2;
		fruitArray[2] = f3;
		
		for(int i = 0; i < 3; i++) {
			System.out.println(fruitArray[i].toString());
		}
	}
}
