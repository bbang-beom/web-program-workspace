package c06;

public class Constructor2 {
	String model;
	String color;
	int maxSpeed;
	
	// 생성자 선언
	/*
	 * 클래스이름(매개변수선언,...) {
	 * // 객체의 초기화 코드
	 * }
	 */
	
//	public Constrictor2(String s1, String s2, int i1) {		
	public Constructor2(String model, String color, int maxSpeed) {
		// this는 자기 자신을 가리킨다.
		this.model = model;
		this.color = color;
		this.maxSpeed = maxSpeed;
	}
	
	public Constructor2() {
		
	}
	
//	}
	
	public static void main(String[] args) {
		Constructor2 constrictor2 = new Constructor2();
		// 클래스 변수에 직접 접근하는 것은 좋지 않다.
		constrictor2.model = "투싼";
		constrictor2.color = "검정";
		constrictor2.maxSpeed = 300;
		System.out.println(constrictor2.model);
		
		// 매개변수가 있는 생성자는 타입과 수를 맞춰야 한다.
		Constructor2 constructor2_1 = new Constructor2("아반떼", "흰색", 250);
		Constructor2 constructor2_2 = new Constructor2("소나타", "흰색", 260);
		Constructor2 constructor2_3 = new Constructor2("제네시스", "검정색", 300);
	}

}
