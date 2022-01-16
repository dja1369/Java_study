package Stream;

import java.util.Arrays;
import java.util.function.BinaryOperator;
import java.util.stream.Stream;

class compareString implements BinaryOperator<String>{
	//FunctionalInterface BinaryOperator �� ������ Ŭ���� 
	@Override
	public String apply(String str1, String str2) {
		//�ѱ۰� ������ ���� üũ�� ���� byte[]�迭�� ���� Ȯ��
		if(str1.getBytes().length > str2.getBytes().length) {
			return str1;
		}
		else
			return str2;
	}

	
}

public class ReduceTest {

	public static void main(String[] args) {
		String[] program = {"python" , "C���" , "Java" , "�ڹ� ��ũ��Ʈ" , "Database" , "Jsp"};
		
		String result1 = Arrays.stream(program).reduce(new compareString()).get();
		//BinaryOperator�� ������ Ŭ������ ������ �ν��Ͻ��� reduce �Ű������� �����ϸ� ���⿡  ������ apply() �޼ҵ尡 �ڵ����� ȣ���
		System.out.println(result1);
		
		//���ٽ����� ���� reduce() ������ ����;
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
