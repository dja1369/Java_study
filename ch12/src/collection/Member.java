package collection;

import java.util.Comparator;

public class Member implements Comparable<Member> , Comparator<Member>{ // treeSet ������ ���� Comparable �������̽� ����
	private int memberID;
	private String memberName;

	public Member(int memberID, String memberName) {
		this.memberID = memberID;
		this.memberName = memberName;
	}

	public Member() {
		//Comparator �������̽��� �����Ͽ� ���Ĺ�� �� ������ �� �ν��Ͻ� �� �Ű������� TreeSet �� �߰��Ҷ� ����ϱ� ����
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

	// ��ü�� ������ ���ڿ��� ��ȯ�ϴ� �޼ҵ�
	@Override
	public String toString() { // ���� ������ �ڵ� ȣ��Ǿ� ��� ����
		return "���̵� �� " + memberID + " �� ȸ���� " + memberName + " �Դϴ�.";
	}

	@Override
	public int hashCode() {
		return memberID;
	}

	@Override // instanceof �� Ÿ�� üũ �Լ�
	public boolean equals(Object obj) { // ȸ���� ���ϼ��� üũ �ϱ� ���� ������
		// �Ű������� ���޵� ��ü�� Ÿ���� Member������ ���� üũ
		if (obj instanceof Member) { // ������ ĳ������ ���� �켱 üũ
			Member member = (Member) obj; // �ٿ� ĳ����
			if (this.memberID == member.memberID)
				return true;
			else
				return false;
		}
		return false;
	}

	@Override
	public int compareTo(Member member) {
		//return this.memberID - member.memberID; // ����� ��ȯ�Ǹ� �������� ���� ���� //
		//return (this.memberID - member.memberID) * (-1);
		//return this.memberName.compareTo(member.memberName); //compareTo ���ڿ� �� ������ 
		return (this.memberName.compareTo(member.memberName)) * (-1);
	}

	@Override
	public int compare(Member str1, Member str2) {
		// TODO Auto-generated method stub
		return str1.memberID - str2.memberID ; //�������� ���� ����
	}

}
