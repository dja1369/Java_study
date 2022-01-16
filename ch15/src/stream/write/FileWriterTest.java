package stream.write;

import java.io.FileWriter;
import java.io.IOException;

public class FileWriterTest {

	public static void main(String[] args) {
		try(FileWriter fw = new FileWriter("write.txt")){
			
			fw.write('A');
			char[] cbuf = { 'B' , 'C' , 'D', 'F'};
			fw.write(cbuf); 		//���� �迭 ��ü
			fw.write(cbuf, 1, 2);	//���� �迭 �Ϻ�
			
			fw.write("���� ���� ��Ʈ��"); 
			String str = "FileWrite";
			
			fw.write(str);
			fw.write(str, 2, 5);
			
			fw.write(100);
			fw.write("100");
			
			
			System.out.println("������ ���� �Ϸ� �Ǿ����ϴ�");			
		}catch(IOException e) {
			System.out.println(e);
		}catch(Exception e) {
			System.out.println(e);
		}
		System.out.println("���� ����");
	}

}
