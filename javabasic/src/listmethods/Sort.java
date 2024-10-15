package listmethods;

public class Sort {
	public static void main(String[] args) {
		int[] number = {15, 3, 23, 64, 77, 46, 42, 174, 68, 78, 91, 5, 76, 310, 84, 342};
		int temp = 0;
		// 위의 배열을 오름차순으로 정렬
		for(int i = 0; i < number.length; i++) {
			for(int j = i; j < number.length; j++) {
				if(number[i] > number[j]) {
					temp = number[i];
					number[i] = number[j];
					number[j] = temp;
				}
			}
		}
		for(int i = 0; i < number.length; i++) {
			System.out.print(number[i] + " ");
		}
	}
}
