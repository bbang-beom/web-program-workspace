package c02;

// 클래스 이름 - 대문자로 시작
// 변수 이름 - 소문자로 시작
public class C02_01_02 {

	public static void main(String[] args) {
		int primaryNumber;
		// 변수는 또 다른 변수에 대입하여 값을 복사할 수 있다.
		int x = 10;
		int y = x;
		System.out.println(x);
		System.out.println(y);
		
		// 변수 값 교환
		int n1 = 3;
		int n2 = 5;
		System.out.println("n1" + n1 + "n2: " + n2);
		// n1 값과 n2 값 교환	
		int temp = n1;
		n1 = n2;
		n2 = temp;
		System.out.println("n1" + n1 + "n2: " + n2);
	}

}
