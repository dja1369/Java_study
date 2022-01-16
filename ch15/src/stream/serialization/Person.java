package stream.serialization;

import java.io.Serializable;
//java.io.NotSerializableException: ����ȭ �ϰڴٴ� �ǻ縦 ǥ��
public class Person implements Serializable {
	//ǥ�� �������̽�, ��Ŀ �������̽� 
	/**
	 *  ����ȭ�� ���� ���� ��ȣ�� �����ϱ� ���� Person Ŭ������ ���� ���콺�� �÷� �ΰ�
	 *  Add generate serial version ID �� Ŭ���ؼ� �ڵ� ����.
	 */
	private static final long serialVersionUID = 7263966142232951976L;
	String name;
	transient String job; //���� �������� ������ ���� �� transient ����� ��� , �⺻ ������ ������ȭ �Ǿ ����.
	public Person(String name, String job) {
		this.name = name;
		this.job = job;
	}
	@Override
	public String toString() {
		return "Person [name=" + name + ", job=" + job + "]";
	}
	
	
}
