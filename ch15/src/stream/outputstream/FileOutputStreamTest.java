package stream.outputstream;

import java.io.FileOutputStream;
import java.io.IOException;

public class FileOutputStreamTest {

	public static void main(String[] args) {
		//FileOutputStream �������� �Ű������� ������ ������ ��ο� ���� ���, ������ ���� ����.
		byte[] bs = new byte[26];
		byte data = 65; // A�� �ƽ�Ű ������ �ʱ�ȭ.
		//������ ���Ͽ� ������ �ִ��� ������ ���� �����(overwrite) : false, default(���� ����)
		// ������ ���� ����ڿ� �����ؼ� �� ������ �ι��� �Ű����� append ���� true�� ����
		try(FileOutputStream fos = new FileOutputStream("output2.txt" )){
			for(int i=0; i<bs.length; i++) {
				bs[i] = data++; //bs�迭�� ��Ҹ� �߰��� �� data���� 1����
			}
			//�迭�� �Ѳ����� �迭�� ����
			fos.write(bs);
			System.out.println(" ��� �Ϸ� ���� ��� Ȯ�� �ϱ� ");
		}catch(IOException e) {
			System.out.println(e);
		}catch (Exception e) {
			System.out.println(e);
		}
		System.out.println(" ���� ���� .");
		
	}

}
