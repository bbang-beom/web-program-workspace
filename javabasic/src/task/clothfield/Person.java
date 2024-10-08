package task.clothfield;

public class Person {
//	private Cloth cloth = new Shirt();
	private Cloth cloth = new Pants();
	
	void putCloth() {
		cloth.put();
	}
	
	public static void main(String[] args) {
		Person person = new Person();
		person.putCloth();
	}
}
