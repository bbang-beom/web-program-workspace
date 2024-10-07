package c07.poly2;

public class HankookTire extends Tire {
	public HankookTire(int maxRotation, String location) {
		super(maxRotation, location);
	}

	@Override
	public boolean roll() {
		// 누적 회전 수 증가
		setAccumulatedRotation(getAccumulatedRotation() + 1);
		// 정상 회전(누적<최대)
		if (getAccumulatedRotation() < getMaxRotation()) {
			System.out.println(getLocation() + "HankookTire 수명: " + (getMaxRotation() - getAccumulatedRotation()) + "회");
			return true;
		} else {
			// 누적>최대
			System.out.println(getLocation() + "HankookTire 펑크 또는 수명이 다하였음");
			return false;
		}
	}

}
