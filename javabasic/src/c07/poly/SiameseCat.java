package c07.poly;

public class SiameseCat extends Cat{

	public static void main(String[] args) {
		// 바로 위의 부모 클래스가 아니더라도 상속 계층에서 상위 타입이라면 자동 타입 변환이 가능하다.
		Animal a1 = new SiameseCat();
		Object o1 = new SiameseCat();
	}

}
