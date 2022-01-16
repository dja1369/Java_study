package stream;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class FileInputStreamTest2 {

	public static void main(String[] args){

		FileInputStream fis = null;
		try {
			fis = new FileInputStream("input.txt");
			//파일 스트림 으로 부터 input.txt 의 한 바이트 씩 읽어 옵니다.
			//파일의 처음부터 끝까지 읽어오기, fis.read() 변환값이 -1 이면 파일의 끝
			int i;
			while((i = fis.read()) != -1) {
				System.out.println();
			}
		} catch (FileNotFoundException e) {
			System.out.println(e.getMessage());
		}catch(Exception e) {
			System.out.println(e);
		} finally {
			// 옆에서 사용한 리소스는 finally 블록에서 닫아야 예외 유무없이 처리 가능
			try {
				fis.close();
			} catch (IOException e) {
				System.out.println(e.getMessage());
			} catch (NullPointerException e) { // 생성되어 있지 않은 스트림을 닫으려고 하면
				System.out.println(e); // 객체가 없는 상태이므로 null을 참조하게 되므로 예외 발생
			} catch (Exception e) { // 그외 (인지하지 못한)예외들을 처리하기 위한 블록
				System.out.println(e);
			}
		}

	}

}
