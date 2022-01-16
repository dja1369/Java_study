package collection.treeset;

import collection.Member;

public class MemberTreeSetTest {

	public static void main(String[] args) {
		MemberTreeSet memberTreeSet = new MemberTreeSet();
		
		memberTreeSet.addMember(new Member(1001, "������"));
		memberTreeSet.addMember(new Member(1002, "ä��ȭ"));
		memberTreeSet.addMember(new Member(1003, "���ؿ�"));
		memberTreeSet.addMember(new Member(1004, "�豤��"));
		
		memberTreeSet.showAllMember();
		
		memberTreeSet.removeMember(1004);
		
		memberTreeSet.showAllMember();
	}

}
