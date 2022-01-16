package stream;

import java.io.File;
import java.io.IOException;

public class FileTest {

	public static void main(String[] args) throws IOException {
		File file = new File("newFile.txt"); //���� ������ �������� ����
		file.createNewFile(); //���� ������ ����
		
		//������ �Ӽ� Ȯ�� �޼ҵ��
		System.out.println(file.isFile()); //true
		System.out.println(file.isDirectory()); //false
		System.out.println(file.getName()); //newFile.txt
		System.out.println(file.getAbsolutePath());//������ ���� ���.
		System.out.println(file.getPath()); //������ ���� ���
		System.out.println(file.canRead()); //true
		System.out.println(file.canWrite());//true
		
		file.delete(); //���� ����
	}

}
