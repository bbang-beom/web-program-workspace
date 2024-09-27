package c04;

public class C04_01_08 {

	public static void main(String[] args) {
		// while문
		// for문이 정해진 횟수만큼 반복한다면, while문은 조건식이 true면 계속 반복
		/*
		 * while(조건식) {
		 *  코드   //조건식이 true면 코드 실행
		 * }
		 */
		int i = 1;
		while(i <= 10) {
			System.out.println(i);
			i++;
		}
		
		// 1~100 합 출력
		int sum = 0;
		int countCheck = 1;
		while(countCheck <= 100) {
			sum += countCheck;
			countCheck++;
		}
		System.out.println(sum);
	}

}
