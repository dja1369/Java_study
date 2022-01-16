package class_exam;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

public class StringClassTest {

	public static void main(String[] args) throws ClassNotFoundException {
		//Ŭ���� �̸� �� ���� Ŭ������ �������� : Static Loading ���� �ε� Runtime �� ���� �߻� ���� 
		Class stringClass = Class.forName("java.lang.String");
		//System.out.println(stringClass.getName());
		
		Constructor[] cons = stringClass.getConstructors(); //�� Ŭ���� �� ������ ����
		for (Constructor c : cons) {
			System.out.println(c);
		}System.out.println("\n\n");
		Method[] methods = stringClass.getMethods(); //�� Ŭ���� �� ��� �޼ҵ�
		for (Method m : methods) {
			System.out.println(m);
		}System.out.println("\n\n");
		Field[] fields = stringClass.getFields(); //�� Ŭ������ ��� ��� ����
		for (Field f : fields) {
			System.out.println(f);
		}System.out.println("\n\n");
		
	}
}
