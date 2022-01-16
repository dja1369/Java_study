package stream;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class FileInputStreamTest2 {

	public static void main(String[] args){

		FileInputStream fis = null;
		try {
			fis = new FileInputStream("input.txt");
			//���� ��Ʈ�� ���� ���� input.txt �� �� ����Ʈ �� �о� �ɴϴ�.
			//������ ó������ ������ �о����, fis.read() ��ȯ���� -1 �̸� ������ ��
			int i;
			while((i = fis.read()) != -1) {
				System.out.println();
			}
		} catch (FileNotFoundException e) {
			System.out.println(e.getMessage());
		}catch(Exception e) {
			System.out.println(e);
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
