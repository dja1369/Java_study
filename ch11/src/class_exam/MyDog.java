package class_exam;

public class MyDog {
	String name;
	String type;
	
	public MyDog(String name , String type) {
		this.name = name;
		this.type = type;
	}
	@Override //�ν��Ͻ��� ������ Ȯ�� �����
	public String toString() {
		return type + " , " + name;
	}
}
