package stream.outputstream;

import java.io.FileOutputStream;
import java.io.IOException;

public class FileOutputStreamTest {

	public static void main(String[] args) {
		//FileOutputStream 생성자의 매개변수로 전달한 파일이 경로에 없을 경우, 파일을 새로 생성.
		byte[] bs = new byte[26];
		byte data = 65; // A의 아스키 값으로 초기화.
		//기존의 파일에 내용이 있더라도 무조껀 새로 덮어쓰기(overwrite) : false, default(생략 가능)
		// 기존의 파일 내용뒤에 연결해서 쓸 것인지 두번재 매개변수 append 값이 true로 설정
		try(FileOutputStream fos = new FileOutputStream("output2.txt" )){
			for(int i=0; i<bs.length; i++) {
				bs[i] = data++; //bs배열에 요소를 추가한 후 data값을 1증가
			}
			//배열을 한꺼번에 배열에 저장
			fos.write(bs);
			System.out.println(" 출력 완료 파일 열어서 확인 하기 ");
		}catch(IOException e) {
			System.out.println(e);
		}catch (Exception e) {
			System.out.println(e);
		}
		System.out.println(" 정상 종료 .");
		
	}

}
