package c05;

public class C05_01_03 {

	public static void main(String[] args) {
		// 배열길이
		// 배열에 저장할 수 있는 전체 항목의 개수
		// 코드에서 배열의 길이를 얻으려면 배열 객체의 필드(field)
		// 클래스 변수, attribute(속성)인 length를 읽는다. (배열변수.length;)
		int[] intArray= {10,20,30};
		System.out.println(intArray.length);// 배열 길이
		// length 필드는 값 변경 불가
//		intArray.length=4; // 변경 불가
		
		int[] scores= {83,90,87,80,100};
		int sum=0;
		for(int i=0;i<scores.length;i++) {
			sum+=scores[i];
		}
		System.out.println("총합: "+sum);

	}

}
