package stream.outputstream;

import java.io.FileOutputStream;
import java.io.IOException;

public class FileOutputStreamTest3 {

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
			//write(����Ʈ �迭 , ��ġ, ����) : �迭�� ��ġ ���� ���̸�ŭ�� ��� �� �ڷ��� �Ϻθ� ������ ��� ���
			fos.write(bs, 3, 10); //bs �迭�� 3�� �ε��� ���� 10���� ����Ʈ �� ����
			System.out.println(" ��� �Ϸ� ���� ��� Ȯ�� �ϱ� ");
		}catch(IOException e) {
			System.out.println(e);
		}catch (Exception e) {
			System.out.println(e);
		}
		System.out.println(" ���� ���� .");
		
	}

}
