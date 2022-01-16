package object;

public class StringTest {

	public static void main(String[] args) {
		
		String javaStr = new String("Java");
		String androidStr = new String("Android");
		
		System.out.println(System.identityHashCode(javaStr));
		System.out.println(javaStr);
		javaStr = javaStr.concat(androidStr);
		//두 문자열을 결합한 이후 결과 , 새로운 문자열이 만들어진 주소를 javaStr이 참조한다
		System.out.println(javaStr);
		/*
		 * String str1 = new String("Test"); String str2 = "Test";
		 * 
		 * System.out.println(str1 == str2); //주소 비교
		 * System.out.println(str1.equals(str2)); //문자열 비교
		 * 
		 * String str3 = "Test"; String str4 = "Test";
		 * 
		 * System.out.println(str3 == str4) ;
		 * System.out.println(System.identityHashCode(str3));
		 * System.out.println(System.identityHashCode(str4));
		 */}
}
