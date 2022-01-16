package stream.reader;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class FileInputStreamTest {

	public static void main(String[] args) {
		//FileInputStream : 바이트 단위 의 스트림
		
		try(FileInputStream fis = new FileInputStream("reader.txt")){
			int i;
			while((i = fis.read()) != -1) {
				System.out.print((char)i);
			}
		}catch(FileNotFoundException e) {
			System.out.println(e);
		}catch(IOException e) {
			System.out.println(e);
		}catch(Exception e) {
			System.out.println(e);
		}
		
		System.out.println("정상 종료");
	}

}
