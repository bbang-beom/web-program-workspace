package c07.poly3;

//매개 변수의 다형성
//자동 타입 변환은 필드의 값을 대입할 때도 발생하지만 주로 메서드를 호출할 때 많이 발생한다.
//메서드를 호출할 때 매개 변수의 타입과 같은 매개 값을 지정하는 것이 일반적이지만 
//매개 값을 다양화하기 위해 매개 변수에 자식 객체를 지정할 수도 있다.
public class Driver {

	public void drive(Vehicle vehicle) {
		vehicle.run();
	}
	
	public static void main(String[] args) {
		Driver d1 = new Driver();
		d1.drive(new Vehicle());
		Vehicle v1 = new Vehicle();
		d1.drive(v1);
		// 매개 변수의 타입이 클래스일 경우, 해당 클래스의 객체뿐 아니라 자식 객체까지도 매개 값으로 사용할 수 있다.
		d1.drive(new Bus());
		// 매개 값으로 어떤 자식 객체가 제공되냐에 따라 메서드의 실행 결과는 다양해질 수 있다.
		// 자식 객체가 부모의 메서드를 재정의했다면 
		// 메서드 내부에서 재정의된 메서드를 호출함으로써 메서드의 실행결과는 다양해진다.
	}

}
