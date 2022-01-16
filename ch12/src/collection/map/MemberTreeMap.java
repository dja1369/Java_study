package collection.map;

import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.TreeMap;

import collection.Member;

public class MemberTreeMap  {
	private TreeMap<Integer, Member> treeMap;

	public MemberTreeMap() {
	//TreeMap의 생성자에 Collections.reverseOrder() 매개 변수로 전달하면 요소를 추가할때 반대로 정렬함
	treeMap = new TreeMap<Integer, Member>(Collections.reverseOrder());
	}
	//회원 추가
	public void addMember(Member member) {
		treeMap.put(member.getMemberID(), member);
	}
	//회원 삭제
	public boolean removeMember(int memberID) {
		if(treeMap.containsKey(memberID)) {
			treeMap.remove(memberID);
			System.out.println(memberID+ " 아이디 삭제");
			return true;
		}
		System.out.println(memberID + " 아이디는 존재하지 않음 ");
		return false;
	}
	
	//회원 정보 출력
	public void showAllMember() {
		System.out.println("================회원정보================");
		//TreeMam 으로 부터 모든 value 을 얻엉와서 요소가 있는동안 모드 요소 를 출력
		Collection<Member> members = treeMap.values();
		
		for(Member member : members) {
			System.out.println(member);
		}
		System.out.println();
		/*
		 * Iterator<Integer> ir = treeMap.keySet().iterator(); while(ir.hasNext()) { int
		 * key = ir.next(); Member member = treeMap.get(key);
		 * System.out.println(member); }
		 */
	}
	
}
