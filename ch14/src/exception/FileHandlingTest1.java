package exception;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class FileHandlingTest1 {

	public static void main(String[] args) {
		FileInputStream fis = null;
		try {
			fis = new FileInputStream("a1.txt");
			//�ý��� ���� ����� �ڿ��� �Ѱ谡 �ֱ� ������  ����� �ݵ�� close() �޼ҵ� �� �ݱ�
			if(fis != null) {
			}
		}
		catch(FileNotFoundException e) {
			System.out.println("FileNotFoundException ���� ó�� ���");
			System.out.println(e.getMessage());
			return;
		}finally { //return���� ������� ����
			System.out.println("finally...");
			if(fis != null) {
				try {
					fis.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
		}
		System.out.println("END");
	}

}
