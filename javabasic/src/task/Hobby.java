package task;

import c06.NetflixContent;

public class Hobby {
	String name;
	String sort;
	String place;
	int startYear;
	int preference;
	
	public Hobby (String name, String sort, String place, int startYear, int preference) {
		this.name = name;
		this.sort = sort;
		this.place = place;
		this.startYear = startYear;
		this.preference = preference;
	}
	
	public Hobby (String name, String sort,  int startYear, int preference) {
		this.name = name;
		this.sort = sort;
		this.place = "실내";
		this.startYear = startYear;
		this.preference = preference;
	}
	
	public Hobby (String name,   int startYear, int preference) {
		this.name = name;
		this.sort = "엔터테인먼트";
		this.place = "실내";
		this.startYear = startYear;
		this.preference = preference;
	}
	
	public static void main(String[] args) {
		Hobby hobby1 = new Hobby("야구 시청", "실내, 실외", 2009, 1);
		Hobby hobby4 = new Hobby("산책", "일상", "실외", 2023, 5);
		Hobby hobby2 = new Hobby("스크린 야구", "스포츠", 2017, 3);
		Hobby hobby3 = new Hobby("게임", "오락", 2010, 4);
		Hobby hobby5 = new Hobby("유튜브 시청",  2014, 2);
		
		Hobby[] hobbyArray = new Hobby[5];
		hobbyArray[0] = hobby1;
		hobbyArray[1] = hobby2;
		hobbyArray[2] = hobby3;
		hobbyArray[3] = hobby4;
		hobbyArray[4] = hobby5;
		
		for(Hobby hA:hobbyArray) {
			System.out.println("내 취미");
			System.out.println("취미명: " + hA.name); 
			System.out.println("분류: " + hA.sort);		
			System.out.println("장소: " + hA.place);
			System.out.println("시작 년도: " + hA.startYear);
			System.out.println("선호도: " + hA.preference);
			System.out.println();
		}
	}
}
