package collection.map;

import collection.Member;

public class MemberTreeMapTest {

	public static void main(String[] args) {

		MemberTreeMap memberTreeMap = new MemberTreeMap();
		
		memberTreeMap.addMember(new Member(1001, "추민하"));
		memberTreeMap.addMember(new Member(1002, "추민상"));
		memberTreeMap.addMember(new Member(1003, "정경하"));
		memberTreeMap.addMember(new Member(1004, "정중상"));
		
		memberTreeMap.showAllMember();
		memberTreeMap.addMember(new Member(1002, "추민상"));
		memberTreeMap.showAllMember(); //중복되지 않음.
		
		memberTreeMap.removeMember(1004);
		memberTreeMap.removeMember(1006);
		
		//memberTreeMap.showAllMember();
		
	}

}
