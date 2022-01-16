package class_exam;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

public class StringClassTest {

	public static void main(String[] args) throws ClassNotFoundException {
		//클래스 이름 을 차아 클래스를 가져오기 : Static Loading 동적 로딩 Runtime 시 오류 발생 가능 
		Class stringClass = Class.forName("java.lang.String");
		//System.out.println(stringClass.getName());
		
		Constructor[] cons = stringClass.getConstructors(); //이 클래스 의 생성자 정보
		for (Constructor c : cons) {
			System.out.println(c);
		}System.out.println("\n\n");
		Method[] methods = stringClass.getMethods(); //이 클래스 의 모든 메소드
		for (Method m : methods) {
			System.out.println(m);
		}System.out.println("\n\n");
		Field[] fields = stringClass.getFields(); //이 클래스의 모든 멤버 변수
		for (Field f : fields) {
			System.out.println(f);
		}System.out.println("\n\n");
		
	}
}
