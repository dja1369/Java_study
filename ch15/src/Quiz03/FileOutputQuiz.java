package Quiz03;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;

public class FileOutputQuiz {

	public static void main(String[] args) {
		
		try(FileOutputStream fos = new FileOutputStream("a.txd");
				OutputStreamWriter osw = new OutputStreamWriter(fos)){
			osw.write("���ݱ��� �ڹ� ���� ����ְ� ���� �߾��!");
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} catch (Exception e) {
			System.out.println(e);
		}
		
	}

}
