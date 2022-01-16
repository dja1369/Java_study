package collection;

import java.util.Comparator;

public class Member implements Comparable<Member> , Comparator<Member>{ // treeSet 정렬을 위한 Comparable 인터페이스 구현
	private int memberID;
	private String memberName;

	public Member(int memberID, String memberName) {
		this.memberID = memberID;
		this.memberName = memberName;
	}

	public Member() {
		//Comparator 인터페이스를 구현하여 정렬방식 을 재정의 한 인스턴스 를 매개변수로 TreeSet 에 추가할때 사용하기 위함
	}

	public int getMemberID() {
		return memberID;
	}

	public void setMemberID(int memberID) {
		this.memberID = memberID;
	}

	public String getMemberName() {
		return memberName;
	}

	public void setMemberName(String memberName) {
		this.memberName = memberName;
	}

	// 객체의 정보를 문자열로 반환하는 메소드
	@Override
	public String toString() { // 참조 변수로 자동 호출되어 사용 가능
		return "아이디 가 " + memberID + " 인 회원은 " + memberName + " 입니다.";
	}

	@Override
	public int hashCode() {
		return memberID;
	}

	@Override // instanceof 는 타입 체크 함수
	public boolean equals(Object obj) { // 회원의 동일성을 체크 하기 위한 재정의
		// 매개변수로 전달된 객체의 타입이 Member인지를 먼저 체크
		if (obj instanceof Member) { // 안전한 캐스팅을 위해 우선 체크
			Member member = (Member) obj; // 다운 캐스팅
			if (this.memberID == member.memberID)
				return true;
			else
				return false;
		}
		return false;
	}

	@Override
	public int compareTo(Member member) {
		//return this.memberID - member.memberID; // 양수가 반환되면 오름차순 으로 정렬 //
		//return (this.memberID - member.memberID) * (-1);
		//return this.memberName.compareTo(member.memberName); //compareTo 문자열 비교 오름차 
		return (this.memberName.compareTo(member.memberName)) * (-1);
	}

	@Override
	public int compare(Member str1, Member str2) {
		// TODO Auto-generated method stub
		return str1.memberID - str2.memberID ; //오름차순 으로 정렬
	}

}
