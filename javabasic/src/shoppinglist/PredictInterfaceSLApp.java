package shoppinglist;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;
import java.util.function.Predicate;

public class PredictInterfaceSLApp {
	
	public List<ShoppingList> addSL(Predicate<ShoppingList> p, List<ShoppingList> list) {
		List<ShoppingList> sl = new ArrayList<ShoppingList>();
		for(ShoppingList s : list) {
			if(p.test(s))  {
				sl.add(s);			
			}
		}
		return sl;
	}
	
	public static void main(String[] args) {
		PredictInterfaceSLApp piSLAPP = new PredictInterfaceSLApp();
		List<ShoppingList> list = new ArrayList<ShoppingList>();
		SLRepo sRepo = new SLRepo();
		sRepo.addSL("샴푸");
		sRepo.addSL("바디워시");
		
		// 내장 함수형 인터페이스
		list = piSLAPP.addSL(s -> s.getName().equals("샴푸"), sRepo.SLs);
		System.out.println("내일까지 사야하는 물품: " + list);

		
		list = piSLAPP.addSL(s -> s.getName().equals("바디워시"), sRepo.SLs);
		System.out.println("급하지 않은 물품: " + list);
		
		// 메서드 참조
		// ShoppingList에 String을 매개변수로 갖는 생성자를 선언하고 사용 가능
		SLRepo functionSRepo = new SLRepo();
		Function<String, ShoppingList> f = ShoppingList::new;
		// 재정의한 addSL(Function<String, ShoppingList> f, String name)사용
		functionSRepo.addSL(f, "샴푸");
		functionSRepo.addSL(f, "바디워시");
		functionSRepo.printSLs(sls->{
			System.out.println("내일까지 사야하는 물품: " + sls.get(0).getName());
			System.out.println("급하지 않은 물품: " + sls.get(1).getName());
			});
	}
}
