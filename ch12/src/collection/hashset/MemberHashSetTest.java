package collection.hashset;

import collection.Member;

public class MemberHashSetTest {

	public static void main(String[] args) {
		MemberHashSet memberHashSet = new MemberHashSet();
		
		memberHashSet.addMember(new Member(1010, "������"));
		memberHashSet.addMember(new Member(1011, "��ȫ��"));
		memberHashSet.addMember(new Member(1012, "������"));
		
		memberHashSet.showAllMember();
		
		memberHashSet.addMember(new Member(1012, "������"));
		memberHashSet.showAllMember();
		
		memberHashSet.removeMember(1011);
		
	}

}
