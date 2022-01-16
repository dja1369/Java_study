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
			// ���� ���� ������ �ð�
			millseconds = System.currentTimeMillis();
			System.out.println("���� ���� ����");
			int i;
			while ((i = fis.read()) != -1) {
				fos.write(i);
				len++;
			}
			//���� ���縦 �ϴ� ���� �ɸ� �ð� 
			millseconds = System.currentTimeMillis() - millseconds;
			System.out.println("���� ���� �Ϸ�");
		} catch (IOException e) {
			System.out.println(e);
		} catch (Exception e) {
			System.out.println(e);
		}
		System.out.println(len + "Byte:");
		System.out.println("���� ���� �ҿ� �ð� : " + millseconds + " �и���");
	}

}
