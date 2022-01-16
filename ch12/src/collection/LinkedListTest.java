package collection;

import java.util.LinkedList;

public class LinkedListTest {

	public static void main(String[] args) {
		LinkedList<String> linkedList = new LinkedList<String>();
		
		linkedList.add("a");
		linkedList.add("b");
		linkedList.add("c");
		
		linkedList.addFirst("Z");
		System.out.println(linkedList);
		
		LinkedList<Member> memberLinkedList = new LinkedList<Member>();
		
		Member member1 = new Member(1001, "�����");
		Member member2 = new Member(1002, "õ����");
		Member member3 = new Member(1003, "������");
		
		memberLinkedList.add(member1);
		memberLinkedList.add(member2);
		memberLinkedList.add(member3);
		
		for(Member Link : memberLinkedList) {
			System.out.println(Link);
		}
	}

}
