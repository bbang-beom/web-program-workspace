package c04;

public class C04_01_06 {

	public static void main(String[] args) {
		// switch문
		// if문처럼 조건식이 true일 경우에 블록 내부의 실행문을 실행하는 것이 아니라
		// 변수가 어떤 값을 갖느냐에 따라 실행문이 선택
		
		/*
		 * switch(변수) {
		 * case 값1: 
		 *      실행문A
		 *      break;
		 * case 값2:
		 * 		실행문B
		 * 		break;
		 * default:
		 * 		실행문C
		 * }
		 */
		int dice = (int)(Math.random()*6) + 1;
		switch (dice) {
		case 1:
			System.out.println("주사위 1");
			break;
		
		case 2: 
			System.out.println("주사위 2");
			break;
		case 3:
			System.out.println("주사위 3");
			break;
			
		case 4:
			System.out.println("주사위 4");
			break;
			
		case 5:
			System.out.println("주사위 5");
			break;
			
		default:
			System.out.println("주사위 6");
			break;
		}
		/*
		 * if문은 조건식의 결과가 true, false 두 가지 밖에 없기 때문에 경우의 수가 많아질수록 else-if를 반복적으로 추가해야 하므로 코드가 복잡해진다
		   switch문은 변수의 값에 따라서 실행문이 결정되기 때문에 코드가 간결하다
		   하지만, 일반적으로 if문을 많이 쓴다

		   switch문은 괄호 안의 변수 값과 동일한 값을 갖는 case로 가서 실행문을 실행
		   만약 괄호 안에 변수 값과 동일한 값을 갖는 case가 없으면 default로 가서 실행문 실행
		   *default 생략 가능
		 */
		// switch 문에 break가 없다면
		int time = 8;
		switch(time) {
		case 8:
			System.out.println("출근");
		case 9:
			System.out.println("회의");
		case 10:
			System.out.println("업무");
		case 11:
			System.out.println("퇴근");
		}
		// switch문에 break가 없다면 case값과 상관없이 다음 case가 연달아 실행된다.
		// case문 끝에 break를 붙여 빠져나가자
		
		char grade = 'B';
		switch (grade) {
		case 'A':
		case 'a':
			System.out.println("우수 회원");
			break;
		case 'B':
		case 'b':
			System.out.println("일반 회원");
		default:
			System.out.println("손님");
			break;
		}
		// String 타입의 switch문
		String position = "과정";
		
		switch(position) {
		case "부장":
			System.out.println("연차 20개");
			break;
			
		case "과장":
			System.out.println("연차 18개");
			
		default:
			System.out.println("연차 15개");
		}
	}

}
