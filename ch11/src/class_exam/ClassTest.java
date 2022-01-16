package class_exam;

public class ClassTest {
		//클래스 를 얻어오는 3가지 방법
	public static void main(String[] args) throws ClassNotFoundException {
		Person person = new Person();
		System.out.println(person.getClass());
		//Static Loading[정적 로딩]
		Class personClass = person.getClass();
		System.out.println(personClass.getName());
		
		Class personClass2 = Person.class;
		System.out.println(personClass2.getName());
		//Dynamic Loading[동적 로딩]
		Class personClass3 = Class.forName("class_exam.Person");
		System.out.println(personClass3.getName());
	}

}
