package class_exam;

public class NewInstanceTest {

	public static void main(String[] args) throws ClassNotFoundException, InstantiationException, IllegalAccessException {
		Person person1 = new Person(); //디폴트 생성자로 직접 new 키워드를 사용하여 인스턴스 생성
		System.out.println(person1);
	
		Class pClass = Class.forName("class_exam.Person");
		Person person2 = (Person)pClass.newInstance();
		System.out.println(person2);
	}

}
