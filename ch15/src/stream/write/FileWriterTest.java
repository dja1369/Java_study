package stream.write;

import java.io.FileWriter;
import java.io.IOException;

public class FileWriterTest {

	public static void main(String[] args) {
		try(FileWriter fw = new FileWriter("write.txt")){
			
			fw.write('A');
			char[] cbuf = { 'B' , 'C' , 'D', 'F'};
			fw.write(cbuf); 		//문자 배열 전체
			fw.write(cbuf, 1, 2);	//문자 배열 일부
			
			fw.write("문자 단위 스트링"); 
			String str = "FileWrite";
			
			fw.write(str);
			fw.write(str, 2, 5);
			
			fw.write(100);
			fw.write("100");
			
			
			System.out.println("파일이 저장 완료 되었습니다");			
		}catch(IOException e) {
			System.out.println(e);
		}catch(Exception e) {
			System.out.println(e);
		}
		System.out.println("정상 종료");
	}

}
