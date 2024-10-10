package task.charge;

public class Bus implements Cost{
	public void pay(int age) {
		System.out.println(age);
		if(age < 0) {
			System.out.println("잘못된 입력 다시 입력하세요.");
		} else if(age <= 5) {
			System.out.println("무료입니다.");
		} else if(age <= 19) {
			System.out.println("요금은 1100원 입니다.");
		} else {
			System.out.println("요금은 1500원 입니다.");
		}
	}
}
