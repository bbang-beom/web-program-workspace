package c07.poly2;

// Tire를 부품으로 가지는 클래스
public class Car {
	
	Tire frontLeftTire;
	Tire frontRightTire;
	Tire backLeftTire;
	Tire backRightTire;
	
	public Tire getFrontLeftTire() {
		return frontLeftTire;
	}
	
	public void setFrontLeftTire(Tire frontLeftTire) {
		this.frontLeftTire = frontLeftTire;
	}

	public Tire getFrontRightTire() {
		return frontRightTire;
	}

	public void setFrontRightTire(Tire frontRightTire) {
		this.frontRightTire = frontRightTire;
	}

	public Tire getBackLeftTire() {
		return backLeftTire;
	}

	public void setBackLeftTire(Tire backLeftTire) {
		this.backLeftTire = backLeftTire;
	}

	public Tire getBackRightTire() {
		return backRightTire;
	}

	public void setBackRightTire(Tire backRightTire) {
		this.backRightTire = backRightTire;
	}

	// 펑크 나면 실행
	public void stop() {
		System.out.println("[자동차가 멈췄습니다.]");
	}
	
	public int run() {
		System.out.println("[자동차가 달립니다.]");
		if(frontLeftTire.roll() == false) {
			stop();
			return 1;
		}
		if(frontRightTire.roll() == false) {
			stop();
			return 2;
		}
		if(backLeftTire.roll() == false) {
			stop();
			return 3;
		}
		if(backRightTire.roll() == false) {
			stop();
			return 4;
		}
		return 0;
	}
}

