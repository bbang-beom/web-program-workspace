package c08.parampoly;

// 강제 타입 변환
// 구현 객체가 인터페이스 타입으로 자동 타입 변환하면 인터페이스에 선언된 메서드만 사용 가능하다는 제약이 따른다.
// 구현 클래스에 선언된 필드와 메서드를 사용해야 할 경우 
// 강제 타입 변환을 해서 다시 구현 클래스 타입으로 변환한 다음 구현 클래스의 필드와 메서드를 사용해야 한다.
public class Bus implements Vehicle {

	@Override
	public void run() {
		System.out.println("버스가 달립니다.");
	}
	
	public void chekFare() {
		System.out.println("승차요금을 체크합니다.");
	}

}
