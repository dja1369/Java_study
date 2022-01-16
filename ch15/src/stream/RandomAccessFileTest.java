package stream;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;

public class RandomAccessFileTest {

	public static void main(String[] args) {
		try {
			//스트림을 생성하지 않고 간단하게 파일에 자료를 쓰거나 읽기 가능함
			RandomAccessFile raf = new RandomAccessFile("random", "rw");
			System.out.println("파일 포인터 : " + raf.getFilePointer());

			raf.writeInt(1000);
			System.out.println("파일 포인터 : " + raf.getFilePointer());

			// raf.writeDouble(Math.PI);
			raf.writeDouble(3.14);
			System.out.println("파일 포인터 : " + raf.getFilePointer());

			raf.writeUTF("안녕하세요"); // 수정된 UTF-8 형식으로 인코딩 하여 사용, 문자 수가 아닌 실제 기록된 바이트 수
			System.out.println("파일 포인터 : " + raf.getFilePointer());
			// 읽어야할 파일의 맨처음위치 부터 파일 포인터 를 이용해서 읽어야함 , 그렇지 않을시 java,io,EOFException 발생
			raf.seek(0);
			System.out.println(raf.readInt());
			System.out.println(raf.readDouble());
			System.out.println(raf.readUTF());
			System.out.println("파일 포인터 : " + raf.getFilePointer());

		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			System.out.println(e);
		}

	}

}
