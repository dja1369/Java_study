package collection.treeset;

import java.util.TreeSet;

public class TreeSetTest {

	public static void main(String[] args) {
		TreeSet<String> treeSet = new TreeSet<String>();
		
		treeSet.add("BBB");
		treeSet.add("CCC");
		treeSet.add("AAA");
		//순서에 관계없이 추가된후 , 오름차 순으로 정렬
		System.out.println(treeSet);
		
	}

}
