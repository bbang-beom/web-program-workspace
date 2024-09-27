package c05;

public class C05_01_01 {

	// 배열
	// 많은 양의 데이터를 적은 코드로 쉽게 처리할 수 있는 배열
	// 같은 타입의 데이터를 연속된 공간에 나열하고
	// 각 데이터에 인덱스(index)를 부여한 자료구조
	public static void main(String[] args) {
		// 학생 30명 성적 저장, 평균
		int score1 = 83;
		int score2 = 90;
		int score3 = 87;
		int sum = score1 + score2 + score3;
		// 하드코딩(hard coding) - 반복되는 코드가 너무 많고 조건문이나 반복문으로 간결해 질 수 있는 코드를 
//		                         코드 양으로 해결하는 방식
		int[] scoreArr = {83, 90, 87};
		
		// 배열의 특징
		// 1. 배열은 같은 타입의 데이터만 저장할 수 있다.
		// 2. 한번 생성된 배열의 길이를 늘리거나 줄일 수 없다.
		
		// 배열 선언
		// 방법 1: 타입[] 변수이름;
		// 방법 2: 타입 변수이름[];
		
		// 방법 1
		int[] intArray;
		double[] doubleArray;
		String[] strArray;
		
		// 방법 2
		int intArray1[];
		double doubleArray1[];
		String strArray1[];
		
		// 배열 생성
		// 값 목록으로 배열 생성
		// 타입[] 변수 = {값0, 값1, 값2, 값3,...};
		// 배열에 저장되어 있는 값을 요소(element)
		String[] names = {"이클립", "김자바", "김코딩"};
		System.out.println(names[0]);
		System.out.println(names[1]);
		System.out.println(names[2]);
		
		//new 연산자로 배열 생성
		//배열은 객체다, class는 객체다
		//타입[] 변수=new 타입[길이];
		//길이는 배열이 저장할 수 있는 값의 개수를 말한다.
		
		int[] intArr=new int[5];
		//배열 길이를 벗어 나서 접근할려면 에러(예외)가 발생됩니다.
				System.out.println(intArr[0]);
				System.out.println(intArr[4]);
//				System.out.println(intArr[5]); // out of bounds error 발생
//				System.out.println(intArr[-1]); // out of bounds error 발생
				
				//숫자형 기본 자료형은 모두 기본값 0으로 초기화.
				for(int i=0;i<5;i++) {
					System.out.println(intArr[i]);
				}	
				
		//객체형 - String, Array, Scanner, System
		//String 빈 배열을 생성하여 초기화 값을 확인
		//객체형 배열은 초기화 값이 null 값으로 초기화 된다.(null - 비어있다.)
		String s1 = null;
		s1 = "문자열";
		
		int[] intArr1 = null;
		intArr1 = new int[10];
		int[] intArr2;
		
		// 값의 목록으로 배열 객체를 생성했을 때 배열 변수를 이미 선언한 후에는
		// 다른 실행문에서 중괄호를 사용한 배열 생성이 허용되지 않는다.
		// 배열 변수를 미리 선언한 후 값 목록들이 나중에 결정되는 상황이면
		// new 연산자를 사용해서 값 목록을 지정해주자
		intArr2 = new int[] {1, 2, 3};
		
		//타입별로 배렬의 초기값
				//분류 | 타입 | 초기값
				//기본 타입(정수)|int[]|0
				//기본 타입(실수|double[]|0
				//기본 타입(논리)|boolean|false
				//객체형(참조 타입)|클래스[]|null
		
	}

}
