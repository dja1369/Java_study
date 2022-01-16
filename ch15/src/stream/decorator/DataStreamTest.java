package stream.decorator;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class DataStreamTest {

	public static void main(String[] args) {
		// �ڷḦ �����Ͽ� �����ϱ� ���� ���� ��Ʈ�� DataOutputStream ���

		try (FileOutputStream fos = new FileOutputStream("data.out");
				DataOutputStream dos = new DataOutputStream(fos)) {
			// �� �ڷ����� �˸´� �޼ҵ� ȣ��
			dos.write(255);
			dos.writeByte(100);
			dos.writeChar('a');
			dos.writeInt(10);
			dos.writeFloat(3.14F);
			dos.writeDouble(3.14);
			dos.writeUTF("�ȳ�");
			System.out.println("���Ͽ� ���");

		} catch (IOException e) {
			System.out.println(e);
		}
		// ���Ͽ� ��ϵ� ������ �°� ������ �ڷ����� �޼ҵ�� �о�� ������ ���ϴ� ���� ����.
		// �ڷḦ �����Ͽ� �����ϱ� ���� ���� ��Ʈ�� DataOutputStream ���

		try (FileInputStream fis = new FileInputStream("data.out"); 
				DataInputStream dis = new DataInputStream(fis)) {
			// �� �ڷ����� �˸´� �޼ҵ� ȣ��
			System.out.println(dis.read());
			System.out.println(dis.readByte());
			System.out.println(dis.readChar());
			System.out.println(dis.readInt());
			System.out.println(dis.readFloat());
			System.out.println(dis.readDouble());
			System.out.println(dis.readUTF());
			System.out.println("���Ϸ� ���� �б� �Ϸ� ");

		} catch (IOException e) {
			System.out.println(e);
		}
	}
}
