package collection.hashset;

import java.util.HashSet;
import java.util.Iterator;

import collection.Member;

public class MemberHashSet { 		 //HashSet
	private HashSet<Member> hashSet; //선언

	public MemberHashSet() {
		hashSet = new HashSet<Member>(); //생성
	}
	
	public void addMember(Member member) { // 추가 
		hashSet.add(member);
		//System.out.println("HashSet 회원 추가 -> " + member.getMemberID());
	}
	
	public boolean removeMember(int memberID) {
		Iterator<Member> iterator =hashSet.iterator(); //순회자를 이용하여 순회
		
		while(iterator.hasNext()) { //다음 회원이 있는지 체크하여 true 일동안 반복
			Member member = iterator.next();
			if(member.getMemberID() == memberID) { //동일 아이디를 가진 회원 이면
				hashSet.remove(member); //회원 객체 삭제.
				System.out.println(memberID + "HashSet 에서 삭제");
				return true;
			}
		}
		System.out.println(memberID + "아이디는 존재하지 않는 회원이라 삭제 불가능 입니다.");
		return false;
	}
	
	public void showAllMember() { //회원 정보 출력
		for(Member member:hashSet) {
			System.out.println(member);
		}
		System.out.println();
	}

}
