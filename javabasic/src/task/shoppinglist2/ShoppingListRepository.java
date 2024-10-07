package task.shoppinglist2;

public class ShoppingListRepository {
	private ShoppingList[] shoppingLists = new ShoppingList[100];
	private int count = 0;
	
	public void createShoppingList(ShoppingList shoppingList) {
		shoppingLists[count++] = shoppingList;
	}
	
	public void printShoppingList() {
		for(int i = 0; i < count; i++) {
			System.out.println(shoppingLists[i].toString());
		}
	}
}
