package object;

public class StringBuilderTest {

	public static void main(String[] args) {
		String str = new String("Java");
		System.out.println("ó�� ���ڿ� : " + str);
		System.out.println(System.identityHashCode(str));
		
		StringBuilder buf = new StringBuilder(str);
		
		System.out.println(System.identityHashCode(buf));
		buf.append(" and ");
		buf.append(" Japanes ");
		buf.append(" are interesting" );
		System.out.println(System.identityHashCode(buf));
		System.out.println(buf);
		
		//StringBuilder �� �߰��� ��� ���ڿ��� ����ϱ� ���� String���� ��ȯ�Ͼ�� ��.
		str = buf.toString();
		System.out.println("��ȯ ���ڿ� : "  + str);
	}

}
