package c04;

public class C04_01_04 {

	public static void main(String[] args) {
		/*
		 * else if 문: if(조건식) {
        				코드A
       				   } else if(조건식2) {
        				코드B
                       } else {
        				코드C
                       }
       코드D
		1.조건식1이 true면 코드A -> 코드D 실행
		2.조건식1이 false면 조건식2로 이동
		3.조건식2가 true면 코드B -> 코드D 실행
		4.조건식2가 false면 코드C -> 코드D 실행    
		 */
		
		int score = 75;
		if(score >= 90) {
			System.out.println("점수가 100~90입니다");
			System.out.println("등급 A");
		} else if(score >= 80) {
			System.out.println("점수가 80~89입니다");
			System.out.println("등급 B");
		} else if(score >= 70) {
			System.out.println("점수가 70~79입니다");
			System.out.println("등급 C");
		} else {
			System.out.println("점수가 70미만ㅇ입니다");
			System.out.println("등급 D");
		}
		//else 블록 생략 가능
		// *하나의 조건식이 true가 되면 if문 전체가 끝난다.
		// ex)
		int score2 = 60;
		if(score2 < 90) {
			System.out.println("90점 미만");
		} else if(score2 < 80) {
			System.out.println("80점 미만"); // 실행 X
		}
		
		// 불필요한 예
		if(score2 < 100 && score2 >= 90) {
			System.out.println("점수가 100~90입니다");
			System.out.println("등급 A");
		} else if(score2 < 90 && score2 >= 80) { // score2 < 90 불필요
			System.out.println("점수가 80~89입니다");
			System.out.println("등급 B");
		}
	}

}
