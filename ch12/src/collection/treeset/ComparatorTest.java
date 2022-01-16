package collection.treeset;

import java.util.TreeSet;

public class ComparatorTest {
	public static void main (String[] args) {
		TreeSet<String> treeSet = new TreeSet<String>(new MyCompare());
													//기본적으로 오름차순 이기에 새로이 정의한 메소드를 적은 클래스를 넣어 주어야함
		treeSet.add("BBB");
		treeSet.add("CCC");
		treeSet.add("AAA");

		
		System.out.println(treeSet); //String 에 compareTo() 메소드가 기본적으로 오름차 순으로 정의 되어있음
	}
}
