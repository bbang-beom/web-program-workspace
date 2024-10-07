package c07.video1;

public class Video {
	private String name;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	public Video() {
		
	}
	
	public Video(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return "Video [name=" + name + "]";
	}
}
