package stream.serialization;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class ExteralizableTest {

	public static void main(String[] args) {
		Dog dog = new Dog("콩이", 7);

		try (FileOutputStream fos = new FileOutputStream("external.dat");
				ObjectOutputStream oos = new ObjectOutputStream(fos)) {
			// serialization : object 값을 쓰기 [직렬화]
			oos.writeObject(dog);
			System.out.println("serialization");
		} catch (IOException e) {
			System.out.println(e);
		} catch (Exception e) {
			System.out.println(e);
		}
		try (FileInputStream fis = new FileInputStream("external.dat");
				ObjectInputStream ois = new ObjectInputStream(fis)) {
			//serialization : 파일로 부터 object 값을 읽어 옵니다 [역직렬화]
			Object obj = ois.readObject();
			if(obj instanceof Dog) {
				Dog myDog = (Dog)obj;
				System.out.println(myDog);
			}
		} catch (IOException e) {
			System.out.println(e);
		} catch (Exception e) {
			System.out.println(e);
		}
	}

}
