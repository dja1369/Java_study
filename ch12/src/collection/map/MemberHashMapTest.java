package collection.map;

import collection.Member;

public class MemberHashMapTest {

	public static void main(String[] args) {

		MemberHashMap memberHashMap = new MemberHashMap();
		
		memberHashMap.addMember(new Member(1001, "추민하"));
		memberHashMap.addMember(new Member(1002, "추민상"));
		memberHashMap.addMember(new Member(1003, "정경하"));
		memberHashMap.addMember(new Member(1004, "정중상"));
		
		memberHashMap.showAllMember();
		memberHashMap.addMember(new Member(1002, "추민상"));
		memberHashMap.showAllMember(); //중복되지 않음.
		
		memberHashMap.removeMemebr(1004);
		memberHashMap.removeMemebr(1006);
		
		//memberHashMap.showAllMember();
		
	}

}
