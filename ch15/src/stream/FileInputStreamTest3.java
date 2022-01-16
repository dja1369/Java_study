package stream;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class FileInputStreamTest3 {

	public static void main(String[] args) {
		//try-with-resources
		try(FileInputStream fis = new FileInputStream("input2.txt")){
			//읽어 들일 배열의 크기를 10바이크 크기로 고정
			byte[] bs = new byte[10];
			int i;
			while((i = fis.read(bs)) != -1) {
				/*
				 * for (byte b : bs) { System.out.print((char)b); }
				 */
				for(int j=0; j<i; j++) {
					System.out.print((char)bs[j]);
				}
				System.out.println("<---- read" + i + "byte...");
			}
			System.out.println("End Of File");
		}catch (FileNotFoundException e) {
			System.out.println(e);
		}
		catch(Exception e) {
			System.out.println(e);
		}
		System.out.println("정상 종료");
	}

}
