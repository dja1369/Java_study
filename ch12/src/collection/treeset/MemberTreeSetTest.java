package collection.treeset;

import collection.Member;

public class MemberTreeSetTest {

	public static void main(String[] args) {
		MemberTreeSet memberTreeSet = new MemberTreeSet();
		
		memberTreeSet.addMember(new Member(1001, "¿Ã¿Õ¡ÿ"));
		memberTreeSet.addMember(new Member(1002, "√§º€»≠"));
		memberTreeSet.addMember(new Member(1003, "±Ë¡ÿøœ"));
		memberTreeSet.addMember(new Member(1004, "±Ë±§»∆"));
		
		memberTreeSet.showAllMember();
		
		memberTreeSet.removeMember(1004);
		
		memberTreeSet.showAllMember();
	}

}
