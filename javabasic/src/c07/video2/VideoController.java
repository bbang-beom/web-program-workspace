package c07.video2;

public class VideoController {
	private Video[] videoArr = new Video[100];
	private int count = 0;
	
	public void createVideo(Video video) {
		videoArr[count++] = video;
	}
	
	public void printVideos() {
		for(int i = 0; i < count; i++) {
			System.out.println(videoArr[i]);
		}
	}
	
	public static void main(String[] args) {
		VideoController vc = new VideoController();
		
		vc.createVideo(new Video("흑백요리사"));
		vc.createVideo(new Video("오징어게임"));
		vc.createVideo(new Video("신입생"));
		vc.createVideo(new Video("경성크리처"));
		
		vc.createVideo(new Tiving("랩:리퍼블릭"));
		vc.createVideo(new Tiving("삼시세끼 라이브"));
		
		vc.printVideos();
	}

}
