package c07.poly2;

public class CarApp {
	public static void main(String[] args) {
		Car car = new Car();
		car.setFrontLeftTire(new Tire(6, "왼쪽앞"));
		car.setFrontRightTire(new Tire(2, "오른쪽앞"));
		car.setBackLeftTire(new Tire(3, "왼쪽뒤"));
		car.setBackRightTire(new Tire(4, "오른쪽뒤"));
		
		for(int i = 0; i < 5; i++) {
			int problemLocation = car.run();
			System.out.println(problemLocation);
			if(problemLocation == 1) {
				System.out.println("왼쪽앞바퀴 교체");
				car.setBackLeftTire(new HankookTire(15, "왼쪽앞"));
				break;
			}else if(problemLocation == 2) {
				System.out.println("오른쪽앞바퀴 교체");
				car.setBackLeftTire(new HankookTire(13, "오른쪽앞"));
			}else if(problemLocation == 3) {
				System.out.println("왼쪽뒷바퀴 교체");
				car.setBackLeftTire(new HankookTire(14, "왼쪽뒤"));				
			}else {
				System.out.println("오른쪽뒷바퀴 교체");
				car.setBackLeftTire(new HankookTire(16, "오른쪽뒤"));								
			}
		}
		// 다른 클래스가 확장되어 원래 있던 클래스와 상호 결합할 때 원래 있던 클래스의 코드 수정 없이 결합된다면
		// 확장성과 유지보수성 관점에서 최고의 결합 방식이다.
	}
}
