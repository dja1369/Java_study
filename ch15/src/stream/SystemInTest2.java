package stream;

import java.io.IOException;

public class SystemInTest2 {

	public static void main(String[] args) {
		System.out.println("���ĺ� �� ���ڸ� �Է��ϰ� ����Ű�� ��������");
		
		try {
			int i = System.in.read(); //�� ����Ʈ �� �о� ������ ��ȯ.
			System.out.println((char)i); //���ڿ� �� ����ȯ �Ͽ� ���.
		} catch (IOException e) {
			System.out.println(e.getMessage());
		}
	}

}
