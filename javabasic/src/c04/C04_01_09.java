package c04;

import java.util.Scanner;

public class C04_01_09 {

	public static void main(String[] args) {
		boolean run = true;
		Scanner scanner = new Scanner(System.in);
		while(run) {
			System.out.println("**************");
			System.out.println("0.종료 | 1.인사");
			System.out.println("**************");
			System.out.print("선택: ");
			int choice = scanner.nextInt();
			switch (choice) {
			case 0:
				run = false;
				break;
			case 1:
				System.out.println("안녕하세요");
				
			default:
				System.out.println("없는 보기 다시 선택해주세요");
				break;
			}
		}
	}

}
