package task;

import java.util.Scanner;

public class Array {

	public static void main(String[] args) {
		Array3 task3 = new Array3();
		task3.task();
	}

}

class Array1 {
	public void task() {
		int[] array1 = {1, 2, 3};
//		int[] array2; array2 = {1, 2, 3}; // 정답 2: 배열은 선언 이후 {}형태 생성 불가
		int[] array3 = new int[3];
		int[][] array4 = new int[3][2];
	}
}

class Array2 {
	public void task() {
		// 배열의 기본 초기값에 대한 설명 틀린 것
		/*
		 * 1. 정수 타입 배열 항목의 기본 초기값은 0
		 * 2. 실수 타입 배열 항목의 기본 초기값은 0.0F 또는 0.0 // 정답: 2 실수 타입 배열 항목의 기본 초기값은 double 타입의 0.0
		 * 3. boolean 타입 배열 항목의 기본 초기값은 true 
		 * 3. 참조 타입 배열 항목의 기본 초기값은 null
		 */
	}
}

class Array3 {
	public void task() {
		boolean run = true;
		int studentNum = 0;
		int[] scores = null;
		int max = 0;
		int sum = 0;
		Scanner scanner = new Scanner(System.in);
		
		while(run) {
			System.out.println("------------------------------------------------");
			System.out.println("1.학생 수 | 2.점수입력 | 3.점수리스트 | 4.분석 | 5.종료");
			System.out.println("------------------------------------------------");
			System.out.print("선택> ");
			int selectNo = Integer.parseInt(scanner.nextLine());
			
			if(selectNo == 1) {
				System.out.print("학생 수: ");
				studentNum = Integer.parseInt(scanner.nextLine());
				scores = new int[studentNum];
			} else if(selectNo == 2) {
				for(int i = 0; i < scores.length; i++) {
					System.out.printf("scores[%d]> ", i);
					scores[i] = Integer.parseInt(scanner.nextLine());
				}
			} else if(selectNo == 3) {
				for(int i = 0; i < scores.length; i++) {
					System.out.printf("scores[%d]> %d\n", i, scores[i]);
				}
			}else if(selectNo == 4) {
				for(int i = 0; i < scores.length; i++) {
					if(max <= scores[i]) {
						max = scores[i];
					}
					sum += scores[i];
				}
				double avg = (double)sum / scores.length;
				System.out.println("최고 점수: " + max);
				System.out.println("평균 점수: " + avg);
			}else if(selectNo == 5) {
				run = false;
			}
		}
		System.out.println("프로그램 종료");
	}
}


