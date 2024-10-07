package task.game;

public class GameList {
	private String name;
	private String sort; // 새로 추가한 종류를 분류하기 위한 변수

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	public String getSort() {
		return sort;
	}

	public void setSort(String sort) {
		this.sort = sort;
	}

	@Override
	public String toString() {
		return "GameList [name=" + name + "]";
	}
}
