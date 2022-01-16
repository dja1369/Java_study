package Stream;

import java.util.Arrays;
import java.util.stream.IntStream;

public class IntArrayStreamTest {

	public static void main(String[] args) {
		int[] array = new int[] {1,2,3,4,5};
		//5�� ���
		for (int i=0; i<array.length; i++) {
			System.out.println(array[i]);
		}
		
		for(int i :array) {
			System.out.println(i);
		}	
		System.out.println("��Ʈ�� �� �̿�");
		Arrays.stream(array).forEach(num -> System.out.println(num)); //���ٽ�����  ����
		
		//sum : �迭�� ����� ��� ���� ����� ��ȯ
		IntStream intStream = Arrays.stream(array);
		int sum = intStream.sum();
		System.out.println("sum : " +sum);
		//stream has already been operated upon or close
		 //long count = intStream.count();
		long count = Arrays.stream(array).count();
		 System.out.println("count : " + count);
	}

}
