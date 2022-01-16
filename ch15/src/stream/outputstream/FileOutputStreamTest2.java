package stream.outputstream;

import java.io.FileOutputStream;
import java.io.IOException;

public class FileOutputStreamTest2 {

	public static void main(String[] args) {
		//FileOutputStream 생성자의 매개변수로 전달한 파일이 경로에 없을 경우, 파일을 새로 생성.
		try(FileOutputStream fos = new FileOutputStream("output.txt")){
			fos.write(65); //숫자에 해당하는 아스키 코스 값이 문자로 변환되어 저장.
			fos.write(66);
			fos.write(67);
			System.out.println(" 출력 완료 파일 열어서 확인 하기 ");
		}catch(IOException e) {
			System.out.println(e);
		}catch (Exception e) {
			System.out.println(e);
		}
		System.out.println(" 정상 종료 .");
		
	}

}
