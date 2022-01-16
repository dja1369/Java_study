package stream.decorator;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;

public class InputStreamReaderTest {

	public static void main(String[] args) {
		//���� ��Ʈ�� InputStreamReader �� �Ű������� ��� ��Ʈ�� FileInputStream�� �޾Ƽ� ����
		//����Ʈ ������ ���� ������ ������ ���� ������ ��ȯ�� ���ִ� ���� ��Ʈ��
		try(InputStreamReader isr = new InputStreamReader(new FileInputStream("reader.txt"))){
			int i;
			while((i = isr.read()) != -1) { //������ ���� �ƴҵ��� ���� ��Ʈ�� ���� �ڷḦ ����
				System.out.print((char)i);
			}
			System.out.println("��� �о����ϴ�.");
		}catch (IOException e) {
			System.out.println(e);
		}catch (Exception e) {
			System.out.println(e);
		}
		System.out.println("���� ���� �Ǿ����ϴ�.");
		
	}

}
