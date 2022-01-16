package collection.map;

import collection.Member;

public class MemberTreeMapTest {

	public static void main(String[] args) {

		MemberTreeMap memberTreeMap = new MemberTreeMap();
		
		memberTreeMap.addMember(new Member(1001, "�߹���"));
		memberTreeMap.addMember(new Member(1002, "�߹λ�"));
		memberTreeMap.addMember(new Member(1003, "������"));
		memberTreeMap.addMember(new Member(1004, "���߻�"));
		
		memberTreeMap.showAllMember();
		memberTreeMap.addMember(new Member(1002, "�߹λ�"));
		memberTreeMap.showAllMember(); //�ߺ����� ����.
		
		memberTreeMap.removeMember(1004);
		memberTreeMap.removeMember(1006);
		
		//memberTreeMap.showAllMember();
		
	}

}
