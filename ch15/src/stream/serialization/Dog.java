package stream.serialization;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;
import java.io.Serializable;

public class Dog implements Serializable, Externalizable{ //���α׷��Ӱ� �����ؾ��� �޼ҵ� : writeExternal() , readExternal()
	private static final long serialVersionUID = 1L;
	
	String name;
	int age;
	//java.io.InvalidClassException: �� ����ȭ�� �� ���ܰ� �߻��ϸ� ����Ʈ �����ڸ� �߰������ ���� �Ҽ� ���� 
	public Dog() {} //���� �������� ����Ʈ �����ڰ� �ڵ����� ȣ��Ǳ� ������ �߰��ؾ���
	
	public Dog(String name, int age) {
		this.name = name;
		this.age = age;
	}
	
	@Override
	public String toString() {
		return "Dog [name=" + name + ", age=" + age + "]";
	}

	@Override
	public void writeExternal(ObjectOutput out) throws IOException { //����ȭ �ÿ� ���
		out.writeUTF(name);
		out.writeInt(age);
	}

	@Override
	public void readExternal(ObjectInput in) throws IOException, ClassNotFoundException { //�� ����ȭ �ÿ� ���
		name = in.readUTF();
		age = in.readInt();
	}
	
	
}
