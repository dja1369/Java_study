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
			System.out.println("���� ���� ����");
			millseconds = System.currentTimeMillis();
			
			int i;
			while((i = bis.read()) != -1) { //���ۿ� �Ű� ���� ������ ������ ���� �ƴҵ��� �б�
				bos.write(i);
				len++;
			}
			System.out.println("���� ���� �Ϸ�");
			millseconds = System.currentTimeMillis() - millseconds; //���翡 �ҿ�� �ð� 
		} catch (IOException e) {
			System.out.println(e);
		} catch (Exception e) {
			System.out.println(e);
		}
		System.out.println((len/1024) + "KB");
		System.out.println("���� ���翡 �ҿ�� �ð� :" + millseconds + "millseconds");
	}
}
