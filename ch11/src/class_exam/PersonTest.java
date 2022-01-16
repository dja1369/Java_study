package class_exam;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

public class PersonTest {

	public static void main(String[] args) throws ClassNotFoundException {
		Person person1 = new Person();
		
		Class pClass = Class.forName("class_exam.Person");
		
		//��� public ������ ������
		Constructor[] cons = pClass.getConstructors();
		for (Constructor c : cons ) {
			System.out.println(c);
		}
		//��� public ��� �ʵ� ������ 
		Field[] field = pClass.getFields();
		for (Field f : field) {
			System.out.println(f);
			System.out.println(f.getName());
		}
		//��� �޼ҵ� ������
		Method[] methods = pClass.getMethods();
		for(Method m : methods) {
			System.out.println(m);
		}
	}

}
