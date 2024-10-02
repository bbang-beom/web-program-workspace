package task.dto;

public class Hobby {
	private String name;
	private int startYear;
	private int preference;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getStartYear() {
		return startYear;
	}
	public void setStartYear(int startYear) {
		this.startYear = startYear;
	}
	public int getPreference() {
		return preference;
	}
	public void setPreference(int preference) {
		this.preference = preference;
	}
	
	@Override
	public String toString() {
		return "Hobby [name=" + name + ", startYear=" + startYear + ", preference=" + preference + "]";
	}
	
	public static void main(String[] args) {
		Hobby hobby1 = new Hobby();
		hobby1.setName("야구 시청");
		hobby1.setStartYear(2009);
		hobby1.setPreference(1);
		Hobby hobby2 = new Hobby();
		hobby2.setName("스크린 야구");
		hobby2.setStartYear(2017);
		hobby2.setPreference(2);
		Hobby hobby3 = new Hobby();
		hobby3.setName("산책");
		hobby3.setStartYear(2023);
		hobby3.setPreference(3);
		
		Hobby[] hobbyArray = new Hobby[10];
		hobbyArray[0] = hobby1;
		hobbyArray[1] = hobby2;
		hobbyArray[2] = hobby3;
		
		for(int i = 0; i < 3; i++) {
			System.out.println(hobbyArray[i].toString());
		}
	}
}
