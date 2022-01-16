package Stream;

import java.util.Arrays;
import java.util.List;

public class StreamTest1 {

	public static void main(String[] args) {
		List<String> sList = Arrays.asList(
				"This is a Java Book",
				"Lamda Expression",
				"Java8 supports lamda Expressions"
				);
		//List의 요소에 대문자 관계 없이 "java"라는 단어가 포함된 문자열 만 필터링 출력
		sList.stream().filter(str -> str.toLowerCase().contains("java")).forEach(str -> System.out.println(str));	
		}

}
