package c04;

public class C04_01_02 {

	public static void main(String[] args) {
		System.out.println("프로그램 시작");
		
		int score = 55;
		
		if(score >= 60) {
			System.out.println("합격");
		}
		// 중괄호 {}블록은 여러 개의 실행문을 하나로 묶기 위해 작성
		// 만약, 실행할 문장이 하나면 중괄호 생략가능 
		if(score < 60) 
			System.out.println("불합격");
		// 위의 if문과는 아무련 관련이 없음
		if(score < 60) {
			System.out.println("불합격");
			System.out.println("조금 더 분발하세요.");
		}
		System.out.println("프로그램 종료");
	}
}
