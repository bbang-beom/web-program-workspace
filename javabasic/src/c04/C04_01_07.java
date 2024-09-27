package c04;

import java.util.Iterator;

public class C04_01_07 {

	// 반복문
	public static void main(String[] args) {
		//for문
		/*
		 * for(초기화식; 조건식; 증감식) {
		 * 조건식이 true일 경우
		 * 실행문;
		 * }
		 */
		
		// for문은 아래를 반복
		// 1. for문이 처음 실행될 때 초기화식이 제일 먼저 실행
		// 2. 조건식을 평가해서 true면 for문 내부의 코드 실행 false면 for문 코드 실행하지않고 종료
		// 3. 블록 내부의 코드가 모두 실행되면 증감식 실행하고 다시 조건식 평가
		// 4. 조건식이 true면 다시 for문 내부 코드 실행
		for(int i = 1; i <= 10; i++) {
			System.out.println(i);
		}
		// 1~5 합 for문 X
		int sum = 0;
		sum += 1;
		sum += 2;
		sum += 3;
		sum += 4;
		sum += 5;
		System.out.println(sum);
		// 1~ 100 합 foa문
		// for문은 여러번 반복할 코드를 짧게 압축한 것 
		// 한번 작성된 코드를 여러번 반복 실행하기 때문에 코드를 간결하게 만든다
		int result = 0;
		for(int i = 1; i <= 100; i++) {
			result += i;
		}
		System.out.println("1~100의 합: " + sum);
		
		// 복잡한 증감식은 쓰지 않는다 주로 ++, -- 증감 연산자 사용
		for(int i = 1; i <= 100; i = i * 5 -3) {
			result += i;
		}
		//변수의 범위, 하위 블록에서 선언된 변수는 상위 블록에서 사용 불가
		for(int i = 1; i <= 10; i++) {
			int sum2 = 0;
			sum2 += i;
		}
//		System.out.println(sum2); // 사용 불가
		

        // 중첩 for문
        // for문은 또 다른 for문을 작성할 수 있는데, 이것을 중첩 for문이라고 한다.
        // 이 경우 바깥쪽 for문을 한번 실행할 때 마다 
        // 중첩된 for문은 지정된 횟수 만큼 반복해서 돌다가 다시 바깥쪽 for문으로 돌아간다.
        for(int i = 0; i < 3; i++) {
        	for(int j = 0; j < 2; j++) {
        		System.out.println("i: " + i + "," + "j: " + j);
        	}
        }
        
		System.out.println(" 구구단");
        for (int i = 1; i < 10; i++) {
            for (int j = 3; j <10; j++) {
                System.out.printf(" %d Χ %d = %-2d ", j, i, i*j);
                 }
        System.out.println();
        }
	}
}
