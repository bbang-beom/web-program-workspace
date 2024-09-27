package c04;

public class C04_01_10 {

	public static void main(String[] args) {
		/*
		 * do {
		 * 		코드
		 * }while(조건식)
		 */
		int i = 3;
		do {
			System.out.println("Hello, Java");
			i++;
		} while(i < 3);
		
		// break문
		// 반복문의 실행을 중지할 때 사용
		// 일반적으로 if문과 같이 사용되어 if문의 조건식에 따라 반복문을 종료할 때 사용
		
		// 주사위 번호 중 하나를 무작위로 반복해서 뽑되, 6나오면 종료
		int count = 1;
		while(true) {
			int num = (int)(Math.random()* 6 + 1);
			System.out.println(num);
			if(num == 6) {
				break;
			}
			count++;
		}
		System.out.println((count) + "반복");
	}

}
