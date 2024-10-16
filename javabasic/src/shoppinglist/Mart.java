package shoppinglist;

public class Mart extends ShoppingList{

	public Mart(String name) {
		super(name);
	}

	@Override
	public String toString() {
		return "Mart [name=" + getName() + "]";
	}

}
