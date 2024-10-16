package shoppinglist;

public class ShoppingList {
	private String name;
	
	// name 생성자 사용
	public ShoppingList(String name) {
		this.name = name;
	}
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return name;
	}
	public String Str() {
		return "ShoppingList [name=" + 'a' + "] ";
	}
	
	
}
