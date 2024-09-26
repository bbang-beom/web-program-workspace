package c04;

public class C04_01_03 {

	public static void main(String[] args) {
		/*
		 * if-else문: if(조건식) {
        				코드A
       				} else {
           				코드B
       				}
       				코드 C
        조건식이 true면 코드A -> 코드C 실행
        조건식이 false면  코드B -> 코드C 실행
		 */
		
		//if문이 else 블록과 함께 사용되어 조건식에 따라 실행 블록 선택
		//if문의 조건식이 true면 if문 블록 실행 false면 else문 블록 실행
		int score = 40;
		if(score >= 60) {
			System.out.println("점수가 60보다 큽니다.");
			System.out.println("합격");
		} else {
			System.out.println("점수가 60보다 작습니다.");
			System.out.println("불합격");
		}
		
	}
}
