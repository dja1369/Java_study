package stream.decorator;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;

public class InputStreamReaderTest {

	public static void main(String[] args) {
		//보조 스트림 InputStreamReader 의 매개변수로 기반 스트림 FileInputStream을 받아서 생성
		//바이트 단위로 읽은 파일의 내용을 문자 단위로 변환을 해주는 보조 스트림
		try(InputStreamReader isr = new InputStreamReader(new FileInputStream("reader.txt"))){
			int i;
			while((i = isr.read()) != -1) { //파일의 끝이 아닐동안 보조 스트림 으로 자료를 읽음
				System.out.print((char)i);
			}
			System.out.println("모두 읽었습니다.");
		}catch (IOException e) {
			System.out.println(e);
		}catch (Exception e) {
			System.out.println(e);
		}
		System.out.println("정상 종료 되었습니다.");
		
	}

}
