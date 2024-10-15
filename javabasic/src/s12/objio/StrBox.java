package s12.objio;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public class StrBox implements Serializable{
	// 참조 변수 s가 참조하는 인스턴스가 Serializable을 구현하는 클래스의 인스턴스면 함께 직렬화된다.
	private String s;
//	private SBox sBox;
//	private Scanner sc;
//	private int i

	public StrBox(String s) {
		this.s = s;
	}

	public String getS() {
		return s;
	}
	
	public static void main(String[] args) {
		StrBox box1 = new StrBox("Robot");
		StrBox box2 = new StrBox("Strawberry");
		List<StrBox> boxs = new ArrayList<StrBox>();
		boxs.add(box1);
		boxs.add(box2);
		
		try {
			ObjectOutputStream oo = new ObjectOutputStream(
					new FileOutputStream("C:/Temp/Object.bin"));
			oo.writeObject(box1);
			oo.writeObject(box2);
			oo.writeObject(boxs);
			System.out.println("저장완료");
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		try {
			ObjectInputStream oi = new ObjectInputStream(
					new FileInputStream("C:/Temp/Object.bin"));
			StrBox box3 = (StrBox)oi.readObject();
			System.out.println(box3.getS());
			StrBox box4 = (StrBox)oi.readObject();
			System.out.println(box4.getS());
			List<StrBox> boxs1 = (List<StrBox>)oi.readObject();
			for(StrBox sb:boxs1) {
				System.out.println(sb.getS());
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
