package task;

public class Constructor {

	public static void main(String[] args) {
		MemberService memberService = new MemberService();
		boolean result = memberService.login("hong", "12345");
		if(result) {
			System.out.println("로그인 되었습니다.");
			memberService.logout("hong");
		} else {
			System.out.println("id 또는 password가 올바르지 않습니다.");
		}
	}

}

class Constructor1 {
	void task() {
		// 생성자에 대한 설명
		// 객체를 생성하려면 생성자 호출이 반드시 필요한 것은 아니다. (x) 객체를 생성하기 위해 생성자가 필요하다.
		// 생성자는 다른 생성자를 호출하기 위해 this()를 사용할 수 있다. (o)
		// 생성자가 선언되지 않으면 컴파일러가 기본 생성자를 추가한다. (o)
		// 매개 변수의 수, 타입, 순서가 다른 생성자를 여러 개 선언할 수 있다. (o)
	}
}

class Member2 {
	String name;
	String firstName;
	public Member2(String name, String firstName) {
		this.name = name;
		this.firstName = firstName;
	}
}

class Constructor2 {
	void task() {
		Member2 user1 = new Member2("홍길동", "hong");
	}
}

class Board {
	String title;
	String content;
	String writer;
	String date;
	int hitcount;
	
	Board(String title, String content) {
		this(title, content, "로그인한 회원아이디", "현재 컴퓨터 날짜", 0);
	}
	
	Board(String title, String content, String writer) {
		this(title, content, writer, "현재 컴퓨터 날짜", 0);
	}
	
	Board(String title, String content, String writer, String date) {
		this(title, content, writer, date, 0);
	}
	
	Board(String title, String content, String writer, String date, int hitcount) {
		this.title = title;
		this.content = content;
		this.writer = writer;
		this.date = date;
		this.hitcount = hitcount;
	}
}

class Constructor4 {
	int hitcount4;
	Board board1 = new Board("name1", "content1");
	Board board2 = new Board("name2", "content2", "writer2");
	Board board3 = new Board("name3", "content3", "writer3", "date3");
	Board board4 = new Board("name4", "content4", "writer4", "date4", hitcount4);
}

class MethodOverloading {
//	메서드 오버로딩에 대한 설명
	// 동일한 이름의 메서드를 여러 개 선언하는 것을 말한다. (o)
	// 반드시 리턴 타입이 달라야 한다. (x) // 리턴 타입이 달라도 매개 변수의 타입, 개수, 순서가 다르면 오버로딩
	// 매개 변수의 타입, 개수, 순서를 다르게 선언해야 한다. (o)
	// 매개 값의 타입 및 개수에 따라 호출될 메서드가 선택된다. (o)
}

class MemberService {
	String id;
	String password;
	
	boolean login(String id, String password) {
		boolean flag;
		this.id = id;
		this.password = password;
		if(id == "hong" && password == "12345") {
			flag = true;
		} else {
			flag = false;
		}
		return flag;
	}
	
	void logout(String id) {
		this.id = id;
		if(id == "hong") {
			System.out.println("로그아웃 되었습니다.");
		} else {
			System.out.println("틀린 id");
		}
	}
}
