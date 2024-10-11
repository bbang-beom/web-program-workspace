package task.shoppingbasket;

import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class ShoppingBasket {
	List<Shopping> shoppingList = new LinkedList<>();
	Scanner scanner = new Scanner(System.in);

	public static void main(String[] args) {
		ShoppingBasket shoppingBasket = new ShoppingBasket();
		Shopping shopping = new Shopping();
		Scanner scanner = new Scanner(System.in);
		boolean run = true;
		while(run) {
			System.out.println("쇼핑(찜) 목록 관리 프로그램");
			System.out.println("0.종료 | 1.추가 | 2.목록보기 | 3.수정 | 4.삭제");
			System.out.print("선택: ");
			int choice = Integer.parseInt(scanner.nextLine());
			switch (choice) {
			case 0:
				System.out.println("프로그램 종료");
				run = false;
				break;
			case 1:
				shoppingBasket.addList();
				break;
			case 2:
				shoppingBasket.readList();
				break;
			case 3:
				shoppingBasket.updateList();
				break;
			case 4:
				shoppingBasket.deleteList();
				break;
	
			default:
				System.out.println("없는 선택지");
				break;
			}
		}
	}	
	public void addList() {
		System.out.print("추가할 상품을 입력하세요: ");
		String name = scanner.nextLine();
		Shopping shopping = new Shopping();
		shopping.setName(name);
		shoppingList.add(shopping);
	}
	
	public void readList() {
		Shopping shopping = new Shopping();
		for(Shopping s:shoppingList) {
				System.out.println(s);
		}
	}
	
	public void updateList() {
		System.out.print("몇번째 상품을 수정하시나요: ");
		int index = Integer.parseInt(scanner.nextLine()) - 1;
		System.out.print("수정할 상품을 입력하세요: ");
		String name = scanner.nextLine();
		Shopping shopping = new Shopping();
		shoppingList.get(index).setName(name);
	}
	
	public void deleteList() {
		System.out.print("몇번째 상품을 삭제하시나요: ");
		int index = Integer.parseInt(scanner.nextLine());
		shoppingList.remove(index-1);
	}
}
