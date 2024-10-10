package task.charge;

import java.util.Scanner;

public class Charge {
	public void payCharge(Cost cost, int age) {
		cost.pay(age);
	}
	
	public static void main(String[] args) {
		String residentNumber = "";
		Scanner scanner = new Scanner(System.in);
		while(true) {
			try {
				System.out.print("주민번호 입력(종료는 0): ");
				residentNumber = scanner.nextLine();
				if(residentNumber.equals("0")) {		
					System.out.println("프로그램 종료");
					break;
				} else if(residentNumber.charAt(7) == '1' || residentNumber.charAt(7) == '2'){
					int age = 124 - Integer.parseInt(residentNumber.substring(0, 1)) + 1;
					Charge charge = new Charge();
					charge.payCharge(new Bus(), age);
				} else if(residentNumber.charAt(7) == '3' || residentNumber.charAt(7) == '4') {
					int age = 24 - Integer.parseInt(residentNumber.substring(0, 2)) + 1;
					Charge charge = new Charge();
					charge.payCharge(new Bus(), age);
				}
			}catch(StringIndexOutOfBoundsException e) {
				System.out.println("주민번호 자리에 맞게 입력하세요");
			}catch (NumberFormatException e) {
				System.out.println("정수를 입력하지 않았습니다.");
				continue;
			}
		}
		scanner.close();
	}
}
