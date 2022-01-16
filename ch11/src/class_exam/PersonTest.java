package class_exam;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

public class PersonTest {

	public static void main(String[] args) throws ClassNotFoundException {
		Person person1 = new Person();
		
		Class pClass = Class.forName("class_exam.Person");
		
		//모든 public 생성자 얻어오기
		Constructor[] cons = pClass.getConstructors();
		for (Constructor c : cons ) {
			System.out.println(c);
		}
		//모든 public 멤버 필드 얻어오기 
		Field[] field = pClass.getFields();
		for (Field f : field) {
			System.out.println(f);
			System.out.println(f.getName());
		}
		//모든 메소드 얻어오기
		Method[] methods = pClass.getMethods();
		for(Method m : methods) {
			System.out.println(m);
		}
	}

}
