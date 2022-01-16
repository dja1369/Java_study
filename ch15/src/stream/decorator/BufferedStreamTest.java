package stream.decorator;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class BufferedStreamTest {

	public static void main(String[] args) {

		long millseconds = 0;
		int len =0;
		try (FileInputStream fis = new FileInputStream("test.zip");
				FileOutputStream fos = new FileOutputStream("copy.zip");
				BufferedInputStream bis = new BufferedInputStream(fis);
				BufferedOutputStream bos = new BufferedOutputStream(fos)) {
			System.out.println("파일 복사 시작");
			millseconds = System.currentTimeMillis();
			
			int i;
			while((i = bis.read()) != -1) { //버퍼에 옮겨 담은 내용이 파일의 끝이 아닐동안 읽기
				bos.write(i);
				len++;
			}
			System.out.println("파일 복사 완료");
			millseconds = System.currentTimeMillis() - millseconds; //복사에 소요된 시간 
		} catch (IOException e) {
			System.out.println(e);
		} catch (Exception e) {
			System.out.println(e);
		}
		System.out.println((len/1024) + "KB");
		System.out.println("파일 복사에 소요된 시간 :" + millseconds + "millseconds");
	}
}
