package stream.serialization;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class SerializableTest {

	public static void main(String[] args) {
		Person person = new Person("�谩��", "ŷ��");

		try (FileOutputStream fos = new FileOutputStream("serial.dat");
				ObjectOutputStream oos = new ObjectOutputStream(fos)) {
			// ���Ͽ� ������ �ν��Ͻ��� ���� -> ����ȭ(serialization)
			oos.writeObject(person);
			System.out.println("����ȭ �Ϸ�");
		} catch (IOException e) {
			System.out.println(e);
		} catch (Exception e) {
			System.out.println(e);
		}

		try (FileInputStream fis = new FileInputStream("serial.dat");
				ObjectInputStream ois = new ObjectInputStream(fis)) {
			// ���Ͽ��� �ν��Ͻ� ���� �о�� ���� -> ������ȭ(deserialization)
			Object obj = ois.readObject();
			//��ü�� �����ϰ� ����ȯ �Ǳ� ���� �켱, Ÿ���� üũ �ϰ� ���ڿ� �ٿ�ĳ����
			if(obj instanceof Person) {
			 Person p = (Person)obj;
			 System.out.println(p); //toString() ȣ���� ��� Ȯ��
			}
			
		} catch (IOException e) {
			System.out.println(e);
		} catch (Exception e) {
			System.out.println(e);
		}

	}

}
