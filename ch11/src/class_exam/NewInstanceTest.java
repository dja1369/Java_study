package class_exam;

public class NewInstanceTest {

	public static void main(String[] args) throws ClassNotFoundException, InstantiationException, IllegalAccessException {
		Person person1 = new Person(); //����Ʈ �����ڷ� ���� new Ű���带 ����Ͽ� �ν��Ͻ� ����
		System.out.println(person1);
	
		Class pClass = Class.forName("class_exam.Person");
		Person person2 = (Person)pClass.newInstance();
		System.out.println(person2);
	}

}
