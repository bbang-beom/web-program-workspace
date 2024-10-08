package c09;

import java.util.Scanner;

public class TryCatch3 {
	public static void main(String[] args) {
		int intNum = 0;
		Scanner scanner = new Scanner(System.in);
		while(true) {
			try {
				System.out.print("정수 입력(종료는 0): ");
				intNum = Integer.parseInt(scanner.nextLine());
				if(intNum == 0) {		
					System.out.println("프로그램 종료");
					break;
				}
				System.out.println("당신이 입력한 정수는 " + intNum + " 입니다.");		
			} catch (NumberFormatException e) {
				System.out.println("정수를 입력하지 않았습니다.");
				continue;
			}
		}
		scanner.close();
	}
}
