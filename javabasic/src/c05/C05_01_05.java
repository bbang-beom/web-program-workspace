package c05;

public class C05_01_05 {

	public static void main(String[] args) {
		// 배열 복사
		// 배열은 한 번 생성하면 크기를 변경할 수 없기 때문에 더 많은 저장 공간이 필요하다면 
		// 더 큰 배열을 새로 만들고 이전 배열로부터 값들을 복사해야 한다.
		
		// 1. for문으로 배열 복사
		int[] oldIntArray = {1, 2, 3};
		int[] newIntArray = new int[5];
		
		for(int i = 0; i < oldIntArray.length; i++) {
			newIntArray [i] = oldIntArray[i];
		}
		
		// 2. System.arraycopy()로 복사
		// System.arraycopy(Object dest, int destPos, int length);
		// 매개변수 의미
		// src -> 원본 배열, srcPos -> 복사 시작할 index, dest -> 새 배열, destPos 붙여넣을 시작 index
		// length -> 복사할 개수
		String[] oldstrArray = {"java", "array", "copy"};
		String[] newStrArray = new String[5];
		System.arraycopy(oldstrArray, 0, newStrArray, 0, oldstrArray.length);
		
		// 향상된 for문 (foreach문)
		// 배열인 컬렉션을 더 쉽게 처리하기 위해 향상된 for문을 제공
		// 컬렉션은 배열의 상위 버전
		// 시퀀스형 자료형(data type)
	
		int[] scores = {95, 71, 84, 93, 87};
		for(int score:scores) {
			System.out.println(score);
		}
		
		// 점수 총합, 평균
		int sum = 0;
		for(int score: scores) {
			sum += score;
		}
		double avg = (double) sum/scores.length;
		System.out.println(sum);
		System.out.println(avg);
	}

}
