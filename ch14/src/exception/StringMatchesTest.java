package exception;

import java.util.regex.Pattern;

public class StringMatchesTest {

	public static void main(String[] args) {
		String str = "my String test";
		
		//정규 표현식을 사용하지 않을때 정확한 문자열이 일치할 때
		System.out.println(str.matches("String"));
		System.out.println(str.matches("my string test"));
		System.out.println(str.matches("my String test"));
		
		//정규 표현식 사용
		System.out.println(str.matches("String.*"));
		System.out.println(str.matches("my.*"));
		System.out.println(str.matches(".*String"));
		System.out.println(str.matches(".*test"));
		
		//유효성 검사 - 정규 표현식은 유효성 검사 코드 작성시 가장 효율적인 방법.
		boolean checkName = Pattern.matches(str, str);
	}

}
