package collection.hashset;

import java.util.HashSet;

public class HashSetTest {

	public static void main(String[] args) {
		HashSet<Integer> hashset = new HashSet<Integer>();
		//�ߺ��� ������� ���� , ������ ��� ���� 
		
		hashset.add(200);
		hashset.add(300);
		hashset.add(100);
		hashset.add(300);

		System.out.println(hashset);
	}

}
