package shoppinglist;

public class ShoppingListRepository {
	private ShoppingList[] shoppingLists = new ShoppingList[100];
	private int count = 0;
	
	// 물품 생성해서 배열에 저장
	public void createSL(ShoppingList sl) {
		shoppingLists[count++] = sl;
	}
	
	// 배열 목록 출력
	public void printshoppingLists() {
		for(int i = 0; i < count; i++) {
			System.out.println(shoppingLists[i].toString());
		}
	}
}
