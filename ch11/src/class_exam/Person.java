package class_exam;

public class Person {
	public String name;
	private int age;
	
	public Person() { //디폴트 생성자
	}
	
	public Person(String name) {
		this.name = name;
	}
	public Person(String name , int age){
		this.name = name;
		this.age = age;
	}


	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}
	
	
}
