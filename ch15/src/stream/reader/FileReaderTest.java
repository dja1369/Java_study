package stream.reader;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class FileReaderTest {

	public static void main(String[] args) {
		//FileReaderStream : 바이트 단위 의 스트림
		//FileReader : 문자 단위 의 스트림
		try(FileReader fr = new FileReader("reader.txt")){
			int i;
			while((i = fr.read()) != -1) {
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
