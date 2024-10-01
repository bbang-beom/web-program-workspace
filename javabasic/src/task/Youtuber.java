package task;

public class Youtuber {
	
	String name;
	String sort;
	String link;
	int subscriber;
	int preference;
	
	public Youtuber (String name, String sort,  String link, int subscriber, int preference) {
		this.name = name;
		this.sort = sort;
		this.link = link;
		this.subscriber = subscriber;
		this.preference = preference;
	}
	
	
	public static void main(String[] args) {
		Youtuber youtuber1 = new Youtuber("숏박스", "comedy", "https://www.youtube.com/@shortbox", 3070000, 4);
		Youtuber youtuber2 = new Youtuber("티빙 스포츠", "sports", "https://www.youtube.com/@tvingsports", 278000, 2);
		Youtuber youtuber3 = new Youtuber("스포티비", "sports", "https://www.youtube.com/@SPOTV", 2060000, 1);
		Youtuber youtuber4 = new Youtuber("빠더너스", "comedy", "https://www.youtube.com/@bdns", 1560000, 5);
		Youtuber youtuber5 = new Youtuber("LCK", "e-sports", "https://www.youtube.com/@LCK", 1330000, 3);
		
		Youtuber[] youtuberArray = new Youtuber[5];
		
		youtuberArray[0] = youtuber1;
		youtuberArray[1] = youtuber2;
		youtuberArray[2] = youtuber3;
		youtuberArray[3] = youtuber4;
		youtuberArray[4] = youtuber5;
		
		for(Youtuber yt:youtuberArray) {
			System.out.println("유튜버");
			System.out.println("유튜브명: " + yt.name); 
			System.out.println("분류: " + yt.sort);		
			System.out.println("링크: " + yt.link);
			System.out.println("구독자 수: " + yt.subscriber);
			System.out.println("선호도: " + yt.preference);
			System.out.println();
			}
		}
	}

