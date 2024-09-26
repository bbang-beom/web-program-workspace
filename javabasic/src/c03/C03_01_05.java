package c03;

public class C03_01_05 {

	public static void main(String[] args) {
		// 삼항 연산자
		// 조건식 ? 피연산자1(값 또는 연산식) : 피연산자2(값 또는 연산식)
		// 조건식을 연산하여 true면 피연산자1 false면 피연산자2 반환
		
		//60점 이상일 때 pass, 아니면 fail 반환
		int score = 95;
		String result = "";
		result = score >= 60 ? "pass" : "fail";
	}
}
