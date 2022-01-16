package stream.decorator;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileCopyTest {

	public static void main(String[] args) {
		long millseconds = 0;
		int len =0;
		
		try (FileInputStream fis = new FileInputStream("test.zip");
				FileOutputStream fos = new FileOutputStream("copy_test.zip")) {
			// 파일 복사 이전의 시간
			millseconds = System.currentTimeMillis();
			System.out.println("파일 복사 시작");
			int i;
			while ((i = fis.read()) != -1) {
				fos.write(i);
				len++;
			}
			//파일 복사를 하는 동안 걸린 시간 
			millseconds = System.currentTimeMillis() - millseconds;
			System.out.println("파일 복사 완료");
		} catch (IOException e) {
			System.out.println(e);
		} catch (Exception e) {
			System.out.println(e);
		}
		System.out.println(len + "Byte:");
		System.out.println("파일 복사 소요 시간 : " + millseconds + " 밀리초");
	}

}
