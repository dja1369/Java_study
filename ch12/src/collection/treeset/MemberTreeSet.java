package collection.treeset;

import java.util.Iterator;
import java.util.TreeSet;

import collection.Member;

public class MemberTreeSet {

	private TreeSet<Member> treeSet; // 선언

	public MemberTreeSet() {
		treeSet = new TreeSet<Member>(new Member()); // 생성

	}

	// 회원 추가
	public void addMember(Member member) {
		treeSet.add(member);
		System.out.println("TreeSet 추가된 회원 : " + member.getMemberID());
	}

	// 회원 삭제
	public boolean removeMember(int memberID) {
		Iterator<Member> iterator = treeSet.iterator(); // 순회자

		while (iterator.hasNext()) { // 회원이 존재하는 동안 반복
			Member member = iterator.next(); // 한명의 회원을 가져와 member에 저장
			if (member.getMemberID() == memberID) { // 매개변수로 전달받은 아이디와 리스트의 회원 아이디가 동일하다면
				treeSet.remove(member);
				System.out.println("treeSet 에서 " + memberID + " 삭제!!!");
				return true;
			}
		}
		System.out.println(memberID + " 존재하지 않은 회원입니다");
		return false;
	}

	public void showAllMember() { // 회원 정보 출력
		for (Member member : treeSet) {
			System.out.println(member);
		}
		System.out.println();

	}
}
