package stream;

import java.io.IOException;

public class SystemInTest {

	public static void main(String[] args) {
		System.out.println("���ĺ� ���� ���ڸ� �Է��ϰ� ����Ű�� ��������");
		
		
		try { 
			int i;
			while((i = System.in.read()) != '\n') { // \n ����Ű.

				System.out.print((char)i); //���ڿ� �� ����ȯ �Ͽ� ���.
			}} catch (IOException e) {
			System.out.println(e.getMessage());
		}
	}

}
