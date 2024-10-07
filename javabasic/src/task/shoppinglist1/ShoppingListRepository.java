package task.shoppinglist1;

public class ShoppingListRepository {
	private ShoppingList[] shoppingLists = new ShoppingList[100];
	private int count = 0;
	
	public void createShoppingLists(ShoppingList shoppingList) {
		shoppingLists[count++] = shoppingList;
	}
	
	public void printShoppingLists() {
		for(int i = 0; i < count; i++) {
			System.out.println(shoppingLists[i].toString());
		}
	}
	
	
	public static void main(String[] args) {
		
	}
}
