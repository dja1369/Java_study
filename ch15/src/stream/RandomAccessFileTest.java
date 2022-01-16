package stream;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;

public class RandomAccessFileTest {

	public static void main(String[] args) {
		try {
			//��Ʈ���� �������� �ʰ� �����ϰ� ���Ͽ� �ڷḦ ���ų� �б� ������
			RandomAccessFile raf = new RandomAccessFile("random", "rw");
			System.out.println("���� ������ : " + raf.getFilePointer());

			raf.writeInt(1000);
			System.out.println("���� ������ : " + raf.getFilePointer());

			// raf.writeDouble(Math.PI);
			raf.writeDouble(3.14);
			System.out.println("���� ������ : " + raf.getFilePointer());

			raf.writeUTF("�ȳ��ϼ���"); // ������ UTF-8 �������� ���ڵ� �Ͽ� ���, ���� ���� �ƴ� ���� ��ϵ� ����Ʈ ��
			System.out.println("���� ������ : " + raf.getFilePointer());
			// �о���� ������ ��ó����ġ ���� ���� ������ �� �̿��ؼ� �о���� , �׷��� ������ java,io,EOFException �߻�
			raf.seek(0);
			System.out.println(raf.readInt());
			System.out.println(raf.readDouble());
			System.out.println(raf.readUTF());
			System.out.println("���� ������ : " + raf.getFilePointer());

		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			System.out.println(e);
		}

	}

}
