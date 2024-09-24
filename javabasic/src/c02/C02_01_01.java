package c02;

/*
 *  변수 선언
 	변수를 사용하기 위해서는 먼저 변수를 선언해야한다.
 	변수 선언은 변수에 어떤 타입의 데이터를 저장할 것인지 그리고 변수 이름이 무엇인지 결정
 */
public class C02_01_01 {

	public static void main(String[] args) {
		/*
		 * 변수 선언은 다음과 같이 한다.
		 * 타입 + 변수 이름
		 */
		
		//정수(int)를 저장할 수 있는 age 변수 선언
		int age;
		
		// 실수(double)를 저장할 수 있는 value 변수 선언
		double vlaue;
		
		// 같은 타입의 변수는 콤마(,)를 이용해서 한꺼번에 선언할 수도 있다.
		int a;
		int b;
		int c, d;
		/*
		 * 변수 이름은 자바 언어에서 정한 아래 규칙을 따라야 한다.
               1. 변수는 문자 or 숫자 or '$', '_'이어야 한다.(숫자로 시작 가능)
                  ex) 가능: price, $price, _price, price1, p1rice
                  불가능:  price(공백 불가), @price, price@, p@rice, $#price
               2. 영어 대소문자를 구분한다.
                  ex) firstname과 firstName은 다른 변수
               3. 첫 문자는 영어 소문자로 시작하지만, 다른 단어가 뒤에 붙을 경우
                  첫 문자를 대문자로 표기(camel 표기법을 사용)
                  ex)max+speed => maxSpeed
               4. 문자 길이의 제한은 없다.(하지만 가독성 높게 지을 것)
		 */
		
		int num;
//		System.out.println(num); // error
		/*
		 * 값 저장: 변수에 값을 저장할 때는 대입 연산자(=)를 사용
           수학에서 등호(=)는 '같다'지만 자바 언어에서는 오른쪽의 값을 왼쪽의 변수에 저장
            자바에서는 변수에 값이 저장되지 않으면 변수 생성X
		 */
		num = 0; // 값 저장
		/*
		 *  선언과 생성은 다른 이야기
			변수 선언은 저장되는 값의 종류와 이름만 언급한 것
			변수에 최초로 값이 저장될 때 변수가 생성된다. 이것을 변수 초기화라 한다.
			또, 그 값을 초기 값이라 한다.
		 */
		int variableNum = 0; // 생성(초기화) 0 -> 초기 값
		//	변수 사용: 출력문이나 연산식 내부에서 변수에 저장된 값을 출력하거나 연산할 때 사용
		int hour = 3;
		int minute = 5;
		System.out.println(hour + "시간" + minute + "분");
		
		int totalMinute = hour * 60 + minute;
		System.out.println("총" + totalMinute + "분");
	}
}
