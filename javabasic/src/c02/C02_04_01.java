package c02;

// 변수와 시스템 입출력
public class C02_04_01 {

	public static void main(String[] args) {
		// 모니터로 변수 값 출력하기
		// println()메소드의 괄호()안에 리터럴은 그대로 출력되고,
		// 변수를 넣으면 변수에 저장된 값이 출력
		// 메서드/의미
		// println(내용);/ 괄호 안의 내용 출력, 개행
		// print(내용);/ 괄호 안의 내용 출력, 개행X
		// printf("형식문자열", 값1, 값2, 값3...)/괄호 안의 첫 번째 문자열 형식대로 내용을 출력
		System.out.println("출력 내용1");
		System.out.print("출력 내용2");
		System.out.print("출력 내용3\n");
		System.out.printf("이름: %s\n", "김자바"); // 정수 %d, 실수 %f, 문자열 %s
		System.out.printf("나이: %d\n", 25);
	}

}
