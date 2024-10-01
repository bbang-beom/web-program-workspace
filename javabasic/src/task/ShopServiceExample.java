package task;

class FinalAndStatic {
	// final 필드와 상수(static final)에 대한 설명
	// 1.final 필드와 상수는 초기값이 저장되면 값을 변경할 수 없다.
	// 2.final 필드와 상수는 생성자에서 초기화 될 수 있다. 
	// X 정답 2. final 필드와 상수는 인스턴스를 생성하지 않고 클래스에 고정되어 있기 때문에 생성자에서 초기화 불가
	// 3.상수의 이름은 대문자로 작성하는 것이 관례이다.
	// 4.상수는 객체 생성 없이 클래스를 통해 사용할 수 있다.
}


public class ShopServiceExample {

	public static void main(String[] args) {
		ShopService obj1 = ShopService.getInstance();
		ShopService obj2 = ShopService.getInstance();
		if(obj1 == obj2) {
			System.out.println("같은 ShopService 객체 입니다.");
		} else {
			System.out.println("다른 ShopService 객체 입니다.");

		}
	}
}
