package exception;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class FileHandlingTest1 {

	public static void main(String[] args) {
		FileInputStream fis = null;
		try {
			fis = new FileInputStream("a1.txt");
			//시스템 에서 사용한 자원은 한계가 있기 때문에  사용후 반드시 close() 메소드 로 닫기
			if(fis != null) {
			}
		}
		catch(FileNotFoundException e) {
			System.out.println("FileNotFoundException 예외 처리 블록");
			System.out.println(e.getMessage());
			return;
		}finally { //return문과 상관없이 수행
			System.out.println("finally...");
			if(fis != null) {
				try {
					fis.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
		}
		System.out.println("END");
	}

}
