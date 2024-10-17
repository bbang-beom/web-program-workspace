package c17.mapping;

import java.util.ArrayList;
import java.util.List;

public class ToyPriceInfo {
	private String model; // 모델 명
	private int price; // 가격
	
	public ToyPriceInfo(String model, int price) {
		this.model = model;
		this.price = price;
	}

	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}
	
	public static void main(String[] args) {
		 List<ToyPriceInfo> list = new ArrayList<ToyPriceInfo>();
		 list.add(new ToyPriceInfo("GUN_LR_45", 200));
		 list.add(new ToyPriceInfo("TEDDY_BEAR", 350));
		 list.add(new ToyPriceInfo("CAR_TRANSFORM_VER_7179", 550));
		 
		 //500원 이상 장난감 
		 int sum = list.stream().filter(p -> p.getPrice() > 500)
				 .mapToInt(t -> t.getPrice()).sum();
		 System.out.println("sum: " + sum);
	}
}
