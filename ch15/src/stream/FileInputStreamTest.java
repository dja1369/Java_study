package stream;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class FileInputStreamTest {

	public static void main(String[] args) throws IOException {

		FileInputStream fis = null;
		try {
			fis = new FileInputStream("input.txt");
			//���� ��Ʈ�� ���� ���� input.txt �� �� ����Ʈ �� �о� �ɴϴ�.
			System.out.println((char)fis.read());
			System.out.println((char)fis.read());
			System.out.println((char)fis.read());
			
			
		} catch (FileNotFoundException e) {
			System.out.println(e.getMessage());
		} finally {
			// ������ ����� ���ҽ��� finally ��Ͽ��� �ݾƾ� ���� �������� ó�� ����
			try {
				fis.close();
			} catch (IOException e) {
				System.out.println(e.getMessage());
			} catch (NullPointerException e) { // �����Ǿ� ���� ���� ��Ʈ���� �������� �ϸ�
				System.out.println(e); // ��ü�� ���� �����̹Ƿ� null�� �����ϰ� �ǹǷ� ���� �߻�
			} catch (Exception e) { // �׿� (�������� ����)���ܵ��� ó���ϱ� ���� ���
				System.out.println(e);
			}
		}

	}

}
