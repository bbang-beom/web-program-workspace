package task.lotto;

import java.util.Scanner;

public class LottoApp {
	public static void main(String[] args) {
		Lottomachine lotto = new Lottomachine();
		Scanner scanner = new Scanner(System.in);
		System.out.println("로또 생성기");
		int ssn = lotto.getSsn();
		while(true) {
			if(lotto.sortAge(ssn) == true) {
				try {			
					System.out.print("구매할 개수를 입력하세요(종료는 0): ");
					int number = Integer.parseInt(scanner.nextLine());
					if(number == 0)
						break;
					if(lotto.buyLimit(number) == true) {
						lotto.buyLotto(number);
					}
				} catch(NumberFormatException e) {
					System.out.println("정수를 입력하세요");
					continue;
				}
			} else
				break;
		}
	}
}

class Lottomachine implements Lotto{
	Scanner scanner = new Scanner(System.in);
	
	@Override
	public void buyLotto(int number) {
		for(int i = 0; i < number; i++) {
			int lottoCount = 0;
			int[] lottoArray = new int[6];
			System.out.println((i+1) + "번째 로또 생성");
			while(true) {
				lottoArray[lottoCount++] = (int)(Math.random() * 45) + 1;
				if(lottoCount == 6) 
					break;
				}
			for(int j = 0; j < 6; j++) {
				System.out.print(lottoArray[j] + " ");
			}
			System.out.println();
		}
	}
	
	@Override
	public boolean sortAge(int ssn) {
		int checkNum = ssn / 10000;
		boolean flag = true;
		if(checkNum == -1) {
			System.out.println("다시 실행하여 숫자를 입력하세요");
			flag = false;
		} else if(checkNum > 5 && checkNum < 24) {
			System.out.println("성인만 구매 가능합니다.");
			flag = false;
		}
		return flag;
	}

	@Override
	public boolean buyLimit(int number) {
		int buyLotto = number;
		boolean flag = true;
		if(buyLotto >= 20) {
			System.out.println("2만원 까지만 구매 가능합니다. 다시 입력하세요");
			flag = false;
		}
		return flag;
	}

	@Override
	public int getSsn() {
		int ssn = 0;
		try {
			System.out.print("주민번호 앞 6자리를 입력하세요: ");
			ssn = Integer.parseInt(scanner.nextLine());
		} catch(NumberFormatException e) {
			return -1;
		}
		return ssn;
	}
	
}