package task;

import java.util.Scanner;

public class Iteration {

	public static void main(String[] args) {
		//확인용 코드
		Interation1 task1 = new Interation1();
		task1.iteration();
		
		Interation2 task2 = new Interation2();
		task2.iteration();
		
		Interation3 task3 = new Interation3();
		task3.iteration();
		
		Interation4 task4 = new Interation4();
		task4.iteration();
		
		Interation5 task5 = new Interation5();
		task5.iteration();
		
		Interation6 task6 = new Interation6();
		task6.iteration();
		
		Interation7 task7 = new Interation7();
		task7.iteration();
		
	}
}

class Interation1 {
	public void iteration() {
		System.out.println("반복문: for, while, do-while");
		System.out.println();
	}
}

class Interation2 {
	public void iteration() {
		System.out.println("1~100 정수 중 3의 배수 총합 출력");
		int sum = 0;
		for(int i = 1; i <= 100; i++) {
			if(i % 3 == 0) {
				sum += i;
			}
		}
		System.out.println(sum);
		System.out.println();

	}
}

class Interation3 {
	public void iteration() {
		System.out.println("주사위 2개 던져 합 5 나올때까지 반복");
		int sum = 0;
		while(sum != 5) {
			int dice1 = (int)(Math.random()*6) + 1;
			int dice2 = (int)(Math.random()*6) + 1;
			sum = dice1 + dice2;
			System.out.printf("눈금: (%d,%d) 합: %d\n", dice1, dice2, sum);
		}
		System.out.println();
	}
}
class Interation4 {
	public void iteration() {
		System.out.println("4x + 5y = 60의 모든 해 구하기");
		for(int x = 1; x < 11; x++) {
			for(int y = 1; y < 11; y++) {
				if(4 * x + 5 * y == 60) {
					System.out.printf("(%d, %d) ", x, y);
				}
			}
		}
		System.out.println();
		System.out.println();
	}
}

class Interation5 {
	public void iteration() {
		System.out.println("for문으로 *증가 출력");
		for(int i = 1; i < 5; i++) {
			for(int j = 0; j < i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		
		System.out.println();
	}
}

class Interation6 {
	public void iteration() {
		System.out.println("for문으로 *증가 출력(오른쪽 정렬)");
		for(int i = 1; i < 5; i++) {
			for(int j = 0; j < 5-(i+1); j++) {
				System.out.print(" ");
			}
			for(int j = 0; j < i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}	
		System.out.println();
	}
}

class Interation7 {
	public void iteration() {
		System.out.println("예금 출금 조회 종료 제공");
		boolean run = true;
		int balance = 0;
		Scanner scanner = new Scanner(System.in);
		
		while(run) {
			System.out.println("------------------------------");
			System.out.println("1.예금 | 2.출금 | 3.잔고 | 4.종료");
			System.out.print("선택> ");
			int choice = scanner.nextInt();
			switch (choice) {
			case 1:
				System.out.print("예금액>");
				int addMoney = scanner.nextInt();
				balance += addMoney;
				System.out.println();
				break;
			case 2:
				System.out.print("출금액>");
				int subMoney = scanner.nextInt();
				balance -= subMoney;
				System.out.println();

				break;
			case 3:
				System.out.print("잔고>" + balance);
				System.out.println();
				System.out.println();

				break;
			case 4:
				System.out.println("프로그램 종료");
				run = false;
				break;

			default:
				System.out.println("없는 선택지 다시 선택해주세요.");
				break;
			}
			
		}
		System.out.println();
	}
}

