package object;

public class StringBuilderTest {

	public static void main(String[] args) {
		String str = new String("Java");
		System.out.println("처음 문자열 : " + str);
		System.out.println(System.identityHashCode(str));
		
		StringBuilder buf = new StringBuilder(str);
		
		System.out.println(System.identityHashCode(buf));
		buf.append(" and ");
		buf.append(" Japanes ");
		buf.append(" are interesting" );
		System.out.println(System.identityHashCode(buf));
		System.out.println(buf);
		
		//StringBuilder 에 추가된 모든 문자열을 출력하기 위해 String으로 변환하어야 함.
		str = buf.toString();
		System.out.println("변환 문자열 : "  + str);
	}

}
