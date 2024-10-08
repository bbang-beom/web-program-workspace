package task.clothparam;

public class Person {
	
	public void putCloth(Cloth cloth) {
		cloth.put();
	}
	
	public static void main(String[] args) {
		Person person = new Person();
		person.putCloth(new Shirt());
		person.putCloth(new Pants());
		
		Shirt shirt = new Shirt();
		person.putCloth(shirt);
		Pants pants = new Pants();
		person.putCloth(pants);
	}
}
