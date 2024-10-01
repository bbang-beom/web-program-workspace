package task;

public class ShopService {
	// Singleton 객체 생성
	private static ShopService shopService = new ShopService();
	
	private ShopService() {
		
	}
	
	static ShopService getInstance() {
		return shopService;
	}
}
