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
		//List�� ��ҿ� �빮�� ���� ���� "java"��� �ܾ ���Ե� ���ڿ� �� ���͸� ���
		sList.stream().filter(str -> str.toLowerCase().contains("java")).forEach(str -> System.out.println(str));	
		}

}
