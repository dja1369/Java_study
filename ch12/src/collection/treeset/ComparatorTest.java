package collection.treeset;

import java.util.TreeSet;

public class ComparatorTest {
	public static void main (String[] args) {
		TreeSet<String> treeSet = new TreeSet<String>(new MyCompare());
													//�⺻������ �������� �̱⿡ ������ ������ �޼ҵ带 ���� Ŭ������ �־� �־����
		treeSet.add("BBB");
		treeSet.add("CCC");
		treeSet.add("AAA");

		
		System.out.println(treeSet); //String �� compareTo() �޼ҵ尡 �⺻������ ������ ������ ���� �Ǿ�����
	}
}
