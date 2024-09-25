package task;

import java.util.Scanner;

public class Input_Output {

	public static void main(String[] args) {

		
	}
	class Input_Output1 {
		public void input_output1() {
			String name = "김자바";
			int age = 25;
			String tel1 = "010", tel2 = "123", tel3 = "4567";
			System.out.println("이름: " + name); // println 자동 개행
			System.out.print("나이: " + age + "\n"); // print \n로 개행
			System.out.printf("%s-%s-%s", tel1, tel2, tel3); // 문자열 형식의 값 출력
		}
	}
	class Input_Output2 {
		public void input_output2() {
			Scanner scanner = new Scanner(System.in);
			// Scanner의 nextLine 메서드로 키보드 입력 저장
			System.out.print("첫번째 수: ");
			String strNum1 = scanner.nextLine();  
			
			System.out.print("두번째 수: ");
			String strNum2 = scanner.nextLine();  
			// Integer 클래스의 parseInt 메서드로 타입 변환
			int num1 = Integer.parseInt(strNum1); 
			int num2 = Integer.parseInt(strNum2); 
			
			int result = num1 + num2;
			System.out.println("덧셈 결과:" + result);
		}
	}
	
	class Input_Output3 {
		public void input_output3() {
			Scanner scanner = new Scanner(System.in);
			System.out.println("[필수 정보 입력]");
			// Scanner의 nextLine 메서드로 키보드 입력 저장
			System.out.print("이름: ");
			String name = scanner.nextLine();  
			
			System.out.print("주민번호 앞 6자리: ");
			String residentNumber = scanner.nextLine();  
			
			System.out.print("전화번호: ");
			String number = scanner.nextLine();  
			
			System.out.println("[입력한 내용]");
			System.out.print(name + "\n" + residentNumber + "\n" + number);
		}
	}
	
	
}
