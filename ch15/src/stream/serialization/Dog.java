package stream.serialization;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;
import java.io.Serializable;

public class Dog implements Serializable, Externalizable{ //프로그래머가 구현해야할 메소드 : writeExternal() , readExternal()
	private static final long serialVersionUID = 1L;
	
	String name;
	int age;
	//java.io.InvalidClassException: 역 직렬화할 때 예외가 발생하면 디폴트 생성자를 추가해줘야 복원 할수 있음 
	public Dog() {} //복원 과정에서 디폴트 생성자가 자동으로 호출되기 때문에 추가해야함
	
	public Dog(String name, int age) {
		this.name = name;
		this.age = age;
	}
	
	@Override
	public String toString() {
		return "Dog [name=" + name + ", age=" + age + "]";
	}

	@Override
	public void writeExternal(ObjectOutput out) throws IOException { //직렬화 시에 사용
		out.writeUTF(name);
		out.writeInt(age);
	}

	@Override
	public void readExternal(ObjectInput in) throws IOException, ClassNotFoundException { //역 직렬화 시에 사용
		name = in.readUTF();
		age = in.readInt();
	}
	
	
}
