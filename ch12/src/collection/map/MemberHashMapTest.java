package collection.map;

import collection.Member;

public class MemberHashMapTest {

	public static void main(String[] args) {

		MemberHashMap memberHashMap = new MemberHashMap();
		
		memberHashMap.addMember(new Member(1001, "�߹���"));
		memberHashMap.addMember(new Member(1002, "�߹λ�"));
		memberHashMap.addMember(new Member(1003, "������"));
		memberHashMap.addMember(new Member(1004, "���߻�"));
		
		memberHashMap.showAllMember();
		memberHashMap.addMember(new Member(1002, "�߹λ�"));
		memberHashMap.showAllMember(); //�ߺ����� ����.
		
		memberHashMap.removeMemebr(1004);
		memberHashMap.removeMemebr(1006);
		
		//memberHashMap.showAllMember();
		
	}

}
