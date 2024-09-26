package c04;

public class C04_01_01 {
	public static void main(String[] args) {
		/*
		 * 조건문:  if문 switch 문
		   if문: if(조선식) {
        		조건식이 true면 {}블록에 있는 코드 실행
        	  	 코드A
       	    	}
       			코드B
        	조건식이 true면 코드A -> 코드B 실행
        	조건식이 false면 코드B 실행
		 */
				
		if(true) {}
		if(false) {}
		boolean b1 = true;
		if(b1) {}
		boolean b2 = false;
		if(b2) {}
		if(10>2) {}
		if(10==9) {}
		if(10 < 9 && 9 < 0) {}
		if(10 < 9 ||9 < 0) {}
		// 조건식에는 true나 false를 산출하는 연산식이나, boolean 타입 변수가 올 수 있다. 
		int score = 93;
		if(score >= 90) {
			System.out.println("점수가 90보다 큽니다");
			System.out.println("등급 A");
		}
		System.out.println("프로그램 종료");
	}
}
