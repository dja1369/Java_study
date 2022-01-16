package exception;

import java.util.regex.Pattern;

public class StringMatchesTest {

	public static void main(String[] args) {
		String str = "my String test";
		
		//���� ǥ������ ������� ������ ��Ȯ�� ���ڿ��� ��ġ�� ��
		System.out.println(str.matches("String"));
		System.out.println(str.matches("my string test"));
		System.out.println(str.matches("my String test"));
		
		//���� ǥ���� ���
		System.out.println(str.matches("String.*"));
		System.out.println(str.matches("my.*"));
		System.out.println(str.matches(".*String"));
		System.out.println(str.matches(".*test"));
		
		//��ȿ�� �˻� - ���� ǥ������ ��ȿ�� �˻� �ڵ� �ۼ��� ���� ȿ������ ���.
		boolean checkName = Pattern.matches(str, str);
	}

}
