package stream.outputstream;

import java.io.FileOutputStream;
import java.io.IOException;

public class FileOutputStreamTest2 {

	public static void main(String[] args) {
		//FileOutputStream �������� �Ű������� ������ ������ ��ο� ���� ���, ������ ���� ����.
		try(FileOutputStream fos = new FileOutputStream("output.txt")){
			fos.write(65); //���ڿ� �ش��ϴ� �ƽ�Ű �ڽ� ���� ���ڷ� ��ȯ�Ǿ� ����.
			fos.write(66);
			fos.write(67);
			System.out.println(" ��� �Ϸ� ���� ��� Ȯ�� �ϱ� ");
		}catch(IOException e) {
			System.out.println(e);
		}catch (Exception e) {
			System.out.println(e);
		}
		System.out.println(" ���� ���� .");
		
	}

}
