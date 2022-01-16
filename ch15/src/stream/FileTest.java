package stream;

import java.io.File;
import java.io.IOException;

public class FileTest {

	public static void main(String[] args) throws IOException {
		File file = new File("newFile.txt"); //아직 파일이 생성되지 않음
		file.createNewFile(); //실제 파일을 생성
		
		//파일의 속성 확인 메소드들
		System.out.println(file.isFile()); //true
		System.out.println(file.isDirectory()); //false
		System.out.println(file.getName()); //newFile.txt
		System.out.println(file.getAbsolutePath());//파일의 절대 경로.
		System.out.println(file.getPath()); //파일의 현재 경로
		System.out.println(file.canRead()); //true
		System.out.println(file.canWrite());//true
		
		file.delete(); //파일 삭제
	}

}
