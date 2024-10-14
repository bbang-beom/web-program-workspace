package s12.file;

import java.io.File;
import java.io.IOException;

// File 클래스
// java.io 패키지에서 제공하는 File클래스는 파일 및 폴더 정보를 제공하는 역할을 한다.
// File 객체를 생성했다고 해서 파일이나 폴더가 생성되는 것은 아니다.
// 또, 제공된 문자열 경로에 실제 파일이나 폴더가 없어도 예외가 발생하지는 않는다.
// 해당 경로에 파일이나 폴더가 있는지 확인하고 싶다면 exists()메서드를 호출해보면 된다.
// exists()메서드는 파일이나 폴더가 존재하면 true 아니면 false를 리턴한다.
public class FilleExample {
	public static void main(String[] args) {
		File dir = new File("C/Temp/images");
		if(dir.exists() == false) {
			//boolean mkdir() - 새로운 폴더 생성(생성 완료되면 true 안되면 false)
			dir.mkdirs();
		}
		
		File file1 = new File("C:/Temp/file1.txt");
		File file2 = new File("C:/Temp/file2.txt");
		File file3 = new File("C:/Temp/file3.txt");
		
			try {
				if(file1.exists() == false) {
				// boolean createNewFile() - 새로운 파일 생성(생성 완료되면 true 안되면 false)
				file1.createNewFile();
				}
				if(file2.exists() == false) {
					// boolean createNewFile() - 새로운 파일 생성(생성 완료되면 true 안되면 false)
					file2.createNewFile();
				}
				if(file3.exists() == false) {
					// boolean createNewFile() - 새로운 파일 생성(생성 완료되면 true 안되면 false)
					file3.createNewFile();
				}
			} catch (IOException e) {
				e.printStackTrace();
			}
			File temp = new File("C:/Temp");
//			File[] listFilles() - 폴더에 포함된 파일 및 서브 폴더 목록 전부를 File 배열로 리턴
			File[] contents = temp.listFiles();
			for(File file: contents) {
				// String getName() - 파일의 이름을 리턴 
				System.out.println(file.getName());
			}
	}
}
