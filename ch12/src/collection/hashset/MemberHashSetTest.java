package collection.hashset;

import collection.Member;

public class MemberHashSetTest {

	public static void main(String[] args) {
		MemberHashSet memberHashSet = new MemberHashSet();
		
		memberHashSet.addMember(new Member(1010, "µµ¿Á«–"));
		memberHashSet.addMember(new Member(1011, "¿Â»´µµ"));
		memberHashSet.addMember(new Member(1012, "¿Â¿±∫π"));
		
		memberHashSet.showAllMember();
		
		memberHashSet.addMember(new Member(1012, "¿Â¿±∫π"));
		memberHashSet.showAllMember();
		
		memberHashSet.removeMember(1011);
		
	}

}
