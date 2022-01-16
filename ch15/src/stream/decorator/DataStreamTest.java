package stream.decorator;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class DataStreamTest {

	public static void main(String[] args) {
		// 자료를 보존하여 저장하기 위한 보조 스트림 DataOutputStream 사용

		try (FileOutputStream fos = new FileOutputStream("data.out");
				DataOutputStream dos = new DataOutputStream(fos)) {
			// 각 자료형에 알맞는 메소드 호출
			dos.write(255);
			dos.writeByte(100);
			dos.writeChar('a');
			dos.writeInt(10);
			dos.writeFloat(3.14F);
			dos.writeDouble(3.14);
			dos.writeUTF("안녕");
			System.out.println("파일에 기록");

		} catch (IOException e) {
			System.out.println(e);
		}
		// 파일에 기록된 순서에 맞게 동일한 자료형의 메소드로 읽어야 오류를 범하는 것을 방지.
		// 자료를 보존하여 저장하기 위한 보조 스트림 DataOutputStream 사용

		try (FileInputStream fis = new FileInputStream("data.out"); 
				DataInputStream dis = new DataInputStream(fis)) {
			// 각 자료형에 알맞는 메소드 호출
			System.out.println(dis.read());
			System.out.println(dis.readByte());
			System.out.println(dis.readChar());
			System.out.println(dis.readInt());
			System.out.println(dis.readFloat());
			System.out.println(dis.readDouble());
			System.out.println(dis.readUTF());
			System.out.println("파일로 부터 읽기 완료 ");

		} catch (IOException e) {
			System.out.println(e);
		}
	}
}
