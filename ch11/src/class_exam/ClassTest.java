package class_exam;

public class ClassTest {
		//Ŭ���� �� ������ 3���� ���
	public static void main(String[] args) throws ClassNotFoundException {
		Person person = new Person();
		System.out.println(person.getClass());
		//Static Loading[���� �ε�]
		Class personClass = person.getClass();
		System.out.println(personClass.getName());
		
		Class personClass2 = Person.class;
		System.out.println(personClass2.getName());
		//Dynamic Loading[���� �ε�]
		Class personClass3 = Class.forName("class_exam.Person");
		System.out.println(personClass3.getName());
	}

}
