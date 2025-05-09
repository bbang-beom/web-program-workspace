package c09;

public class TryCatch2 {
	public static void main(String[] args) {
		// 실행 예외 처리
		String data1 = "100";
		String data2 = "a100";
		try {
			int value1 = Integer.parseInt(data1);
			int value2 = Integer.parseInt(data2);
			int result = value1 + value2;
			System.out.println(data1 + "+" + data2 + "=" + result);			
		} catch (NumberFormatException e) {
			System.out.println("숫자로 변환할 수 없습니다.");
		}
		System.out.println("end");
		/*
		 * try {
		 * 1. ...
		 * 2. 예외 발생 지점
		 * 3. ...
		 * } catch(Exception e) {
		 * 4. ...
		 * }
		 * 5. 예외 처리 이후 실행 지점
		 * 
		 * 예외가 발생했을 때 실행 순서
		 * 1 -> 2 -> 4 -> 5
		 * 예외가 발생하지 않았을 때 실행 순서
		 * 1 -> 2 -> 3 -> 5
		 */
		
	}
}
