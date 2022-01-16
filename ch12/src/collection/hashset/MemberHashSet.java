package collection.hashset;

import java.util.HashSet;
import java.util.Iterator;

import collection.Member;

public class MemberHashSet { 		 //HashSet
	private HashSet<Member> hashSet; //����

	public MemberHashSet() {
		hashSet = new HashSet<Member>(); //����
	}
	
	public void addMember(Member member) { // �߰� 
		hashSet.add(member);
		//System.out.println("HashSet ȸ�� �߰� -> " + member.getMemberID());
	}
	
	public boolean removeMember(int memberID) {
		Iterator<Member> iterator =hashSet.iterator(); //��ȸ�ڸ� �̿��Ͽ� ��ȸ
		
		while(iterator.hasNext()) { //���� ȸ���� �ִ��� üũ�Ͽ� true �ϵ��� �ݺ�
			Member member = iterator.next();
			if(member.getMemberID() == memberID) { //���� ���̵� ���� ȸ�� �̸�
				hashSet.remove(member); //ȸ�� ��ü ����.
				System.out.println(memberID + "HashSet ���� ����");
				return true;
			}
		}
		System.out.println(memberID + "���̵�� �������� �ʴ� ȸ���̶� ���� �Ұ��� �Դϴ�.");
		return false;
	}
	
	public void showAllMember() { //ȸ�� ���� ���
		for(Member member:hashSet) {
			System.out.println(member);
		}
		System.out.println();
	}

}
