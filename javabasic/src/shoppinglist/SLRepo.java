package shoppinglist;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;

public class SLRepo {
	List<ShoppingList> SLs = new ArrayList<ShoppingList>();
	
	public void printSLs(PrintSLs psls) {
		psls.printSLs(SLs);
	}
	
	public void addSL(String name) {
		ShoppingList sl = new ShoppingList(name);
		sl.setName(name);
		SLs.add(sl);
	}
	
	// Function을 사용할 addSL 재정의
	public void addSL(Function<String, ShoppingList> f, String name) {
		SLs.add(f.apply(name));
	}
}
