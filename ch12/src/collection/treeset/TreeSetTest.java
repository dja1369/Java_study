package collection.treeset;

import java.util.TreeSet;

public class TreeSetTest {

	public static void main(String[] args) {
		TreeSet<String> treeSet = new TreeSet<String>();
		
		treeSet.add("BBB");
		treeSet.add("CCC");
		treeSet.add("AAA");
		//������ ������� �߰����� , ������ ������ ����
		System.out.println(treeSet);
		
	}

}
