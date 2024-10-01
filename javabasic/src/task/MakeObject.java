package task;

import java.util.Scanner;

class SlotMachine {
	int money;
	String drink;
	int cost;
	
	SlotMachine(String drink, int cost) {
		this.drink = drink;
		this.cost = cost;
	}
	
	int deposit(int money) {
		System.out.println(money + "원 넣었습니다.");
		this.money = money;
		return money;
	}
	
	void getDrink(String drink, int amount) {
		System.out.println(drink + " " + amount + "개 구매");
		this.money -= this.cost * amount;
	}
	
	void change() {
		System.out.println("잔돈: " + this.money);
	}
}

class RemoteController {
	boolean power;
	int volume;
	
	void powerOn() {
		power = true;
		System.out.println("전원 ON");
	}
	
	int remoteVolume(int volume) {
		System.out.println(volume + "볼륨 설정 완료");
		this.volume = volume;
		return volume;
	}
	void powerOff() {
		power = false;
		System.out.println("전원 OFF");
	}
}

class BasicCalculator {
	Scanner scanner = new Scanner(System.in);
	void plus(int x, int y) {
		int plus = 0;
		plus = x + y;
		System.out.println("결과:" + plus);
	}
		void minus(int x, int y) {
			System.out.println("뺄셈");
			int minus = 0;
			minus = x - y;
			System.out.println("결과:" + minus);
		}
		void multiply(int x, int y) {
			int multiply = 0;
			multiply = x * y;
			System.out.println("결과:" + multiply);
		}
		void divide(int x, int y) {
			double divide = 0.0;
			divide = (double)x / y;
			System.out.println("결과:" + divide);
		}
		
		void pow(int x, int y) {
			double pow = 0.0;
			pow = Math.pow((double)x, (double)y);
			System.out.println("결과:" + pow);
		}
		
		void sqrt(int x){
			double sqrt = 0.0;
			sqrt = Math.sqrt((double)x);
			System.out.println("결과:" + sqrt);
		}
		
		int InputIntNumber1() {
			System.out.print("첫번째 수 입력: ");
			int x = Integer.parseInt(scanner.nextLine());
			return x;
		}
		
		int InputIntNumber2() {
			System.out.print("두번째 수 입력: ");
			int y = Integer.parseInt(scanner.nextLine());
			return y;
		}
		
		void choiceCalculation() {
			boolean run = true;
			while(run) {
				System.out.println("0.종료 | 1.덧셈 | 2.뺄셈 | 3.곱셈 | 4.나눗셈 | 5.제곱 | 6.제곱근 |");
				System.out.print("함수 선택: ");
				int choice = Integer.parseInt(scanner.nextLine());
			switch (choice) {
			case 1:
				System.out.println("덧셈 "); 
				plus(InputIntNumber1(), InputIntNumber2());
				break;
			case 2:
				System.out.println("뺄셈 ");
				minus(InputIntNumber1(), InputIntNumber2());
				break;
			case 3:
				System.out.println("곱셈 ");
				multiply(InputIntNumber1(), InputIntNumber2());
				break;
			case 4:
				System.out.println("나눗셈 ");
				divide(InputIntNumber1(), InputIntNumber2());
				break;
			case 5:
				System.out.println("제곱 ");
				pow(InputIntNumber1(), InputIntNumber2());
				break;
			case 6:
				System.out.println("제곱근 ");
				sqrt(InputIntNumber1());
				break;
			case 0:
				System.out.println("종료");
				run = false;
				break;

			default:
				System.out.println("다른 보기 입력");
				break;
			}
		}
	}
}



public class MakeObject {

	public static void main(String[] args) {
		SlotMachine slotMachine = new SlotMachine("coke", 1000);
		slotMachine.deposit(10000);
		slotMachine.getDrink("coke", 3);
		slotMachine.change();
		
		RemoteController remoteController = new RemoteController();
		remoteController.powerOn();
		remoteController.remoteVolume(30);
		remoteController.powerOff();
		
		BasicCalculator basicCalculator = new BasicCalculator();
		basicCalculator.choiceCalculation();
		
	}

}
