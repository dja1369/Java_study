package Stream;

import java.util.Arrays;
import java.util.function.BinaryOperator;
import java.util.stream.Stream;

class compareString implements BinaryOperator<String>{
	//FunctionalInterface BinaryOperator 를 구현한 클래스 
	@Override
	public String apply(String str1, String str2) {
		//한글과 영문의 길이 체크를 위해 byte[]배열로 변경 확인
		if(str1.getBytes().length > str2.getBytes().length) {
			return str1;
		}
		else
			return str2;
	}

	
}

public class ReduceTest {

	public static void main(String[] args) {
		String[] program = {"python" , "C언어" , "Java" , "자바 스크립트" , "Database" , "Jsp"};
		
		String result1 = Arrays.stream(program).reduce(new compareString()).get();
		//BinaryOperator를 구현한 클래스로 생성한 인스턴스를 reduce 매개변수로 전달하면 여기에  구현된 apply() 메소드가 자동으로 호출됨
		System.out.println(result1);
		
		//람다식으로 직접 reduce() 연산을 구현;
		String result2 = Arrays.stream(program).reduce("",(str1 ,str2) -> {
			if(str1.getBytes().length > str2.getBytes().length) {
				return str1;
			}
			else
				return str2;
		});
		System.out.println(result2);
	}

}
