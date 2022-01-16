package exception;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class FileHandlingTest2 {

	public static void main(String[] args) {
		FileInputStream fis = null;
		try {
			fis = new FileInputStream("a.txt");
		}
		catch(FileNotFoundException e) {
			System.out.println("FileNotFoundException ���� ó�� ���");
			System.out.println(e.getMessage());
		}finally {
			System.out.println("finally...");
		}
		System.out.println("END");
	}

}
