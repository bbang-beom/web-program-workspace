package c08.parampoly;

// 매개 변수의 다형성
public class Driver {
 
	public void drive(Vehicle vehicle) {
	 vehicle.run();
 	}
	
	public static void main(String[] args) {
		Driver d = new Driver();
		d.drive(new Bus());
		Bus b = new Bus();
		d.drive(b);
		d.drive(new Taxi());
		
		Vehicle vehicle = new Bus();
		vehicle.run();
//		vehicle.checkFare(); // 사용 불가
		Bus b2 = (Bus) vehicle;
		b2.run();
		b2.chekFare();
		// instanceof 연산자는 인터페이스 타입에서도 사용 가능하다.
		// 그러므로 instanceof 연산자로 확인하고 안전하게 강제 타입 변환이 가능하다.
		if(vehicle instanceof Bus) {
			Bus bus = (Bus)vehicle;
		}
		
	}
}
