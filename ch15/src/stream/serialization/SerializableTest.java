package stream.serialization;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class SerializableTest {

	public static void main(String[] args) {
		Person person = new Person("김갑수", "킹군");

		try (FileOutputStream fos = new FileOutputStream("serial.dat");
				ObjectOutputStream oos = new ObjectOutputStream(fos)) {
			// 파일에 생성한 인스턴스를 저장 -> 직렬화(serialization)
			oos.writeObject(person);
			System.out.println("직렬화 완료");
		} catch (IOException e) {
			System.out.println(e);
		} catch (Exception e) {
			System.out.println(e);
		}

		try (FileInputStream fis = new FileInputStream("serial.dat");
				ObjectInputStream ois = new ObjectInputStream(fis)) {
			// 파일에서 인스턴스 값을 읽어와 복원 -> 역직렬화(deserialization)
			Object obj = ois.readObject();
			//객체가 안전하게 형변환 되기 위해 우선, 타입을 체크 하고 난뒤에 다운캐스팅
			if(obj instanceof Person) {
			 Person p = (Person)obj;
			 System.out.println(p); //toString() 호출한 결과 확인
			}
			
		} catch (IOException e) {
			System.out.println(e);
		} catch (Exception e) {
			System.out.println(e);
		}

	}

}
