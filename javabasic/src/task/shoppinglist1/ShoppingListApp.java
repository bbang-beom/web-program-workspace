package task.shoppinglist1;

import java.util.Scanner;

public class ShoppingListApp {
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		ShoppingListRepository slr = new ShoppingListRepository();
		while(true) {
			System.out.println("0.종료 | 1.다이소 물품 등록 | 2. 마트 물품 등록 | 3.물품 보기");
			System.out.print("선택: ");
			int choice = Integer.parseInt(scanner.nextLine());
			switch (choice) {
			case 0:
				System.out.println("종료.");
				return;
			case 1:
				System.out.print("물품 명: ");
				String name = scanner.nextLine();
				ShoppingList sl = new Daiso();
				sl.setName(name);
				slr.createShoppingLists(sl);
				System.out.println(name + " 물품이 등록되었습니다.");
				break;
				
			case 2:
				System.out.print("물품 명: ");
				String name1 = scanner.nextLine();
				ShoppingList sl1 = new Mart();
				sl1.setName(name1);
				slr.createShoppingLists(sl1);
				System.out.println(name1 + " 물품이 등록되었습니다.");
				break;
				
			case 3:
				slr.printShoppingLists();
				break;
				
			default:
				break;
			}
		}
	}
}
