package task.shoppinglist1;

public class ShoppingList {
	private String name;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return "ShoppingList [name=" + name + "]";
	}
	
}
