package object;

public class StringTest {

	public static void main(String[] args) {
		
		String javaStr = new String("Java");
		String androidStr = new String("Android");
		
		System.out.println(System.identityHashCode(javaStr));
		System.out.println(javaStr);
		javaStr = javaStr.concat(androidStr);
		//�� ���ڿ��� ������ ���� ��� , ���ο� ���ڿ��� ������� �ּҸ� javaStr�� �����Ѵ�
		System.out.println(javaStr);
		/*
		 * String str1 = new String("Test"); String str2 = "Test";
		 * 
		 * System.out.println(str1 == str2); //�ּ� ��
		 * System.out.println(str1.equals(str2)); //���ڿ� ��
		 * 
		 * String str3 = "Test"; String str4 = "Test";
		 * 
		 * System.out.println(str3 == str4) ;
		 * System.out.println(System.identityHashCode(str3));
		 * System.out.println(System.identityHashCode(str4));
		 */}
}
