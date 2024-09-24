package task;

public class Receipe {

	public static void main(String[] args) {
		String sugarAmount = "4T";
		String syrupAmount = "2T";
		String sourceAmount = "1T";
		String soysourceAmount = "12T";
		String paperAmount = "약간";
		String garlicAmount = "3T";
		String oilAmount = "3T";
		String addOil = "2T";
		int time = 30;
		System.out.println("소불고기 레시피");
		System.out.println("소고기 등심에 설탕 " + sugarAmount +
						   ", 물엿 " + syrupAmount + 
						   " 넣습니다. 거기에 매실액 " + sourceAmount + 
						   ", 간장 " + soysourceAmount + 
						   ", 후추 " + paperAmount +
						   " 넣고 주물러 양념이 배게 해줍니다. 여기에 참기름을 "
						   + oilAmount + "을 넣고 주물러" + time +
						   "분 기다려줍니다. 재워 둔 고기에 야채를 모두 넣고 참기름을 "
						   + addOil + " 더 첨가한 뒤 섞어주고 센불에 구우면 끝!");
	}

}
