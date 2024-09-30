package c06;

public class Ride {
	String company = "현대자동차";
	int speed;
	
	public static void main(String[] args) {
		// 필드 사용
		// Ride 클래스의 인스턴스 생성
		Ride ride = new Ride();
		System.out.println(ride.company);
		// 초기값이 지정되지 않은 필드는 객체 생성시 자동으로 기본 초기값으로 생성
		// 필드의 데이터를 직접 접근하는 것은 객체지향 관점에서 좋지않다.
		// 결합도를 올려 유지 보수와 확장성을 떨어트리기 때문
		// 클래스 간의 상호작용은 메시지로만 하고 메시지를 전달하는 것이 메서드이다.
		// 클래스 간 상호 작용은 메서드로 한다.
		// 필드 데이터를 상호작용하는 메서드를 게터, 세터 메서드 라고한다.
  
		
	}

}
