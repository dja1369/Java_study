package collection.treeset;

import java.util.Iterator;
import java.util.TreeSet;

import collection.Member;

public class MemberTreeSet {

	private TreeSet<Member> treeSet; // ����

	public MemberTreeSet() {
		treeSet = new TreeSet<Member>(new Member()); // ����

	}

	// ȸ�� �߰�
	public void addMember(Member member) {
		treeSet.add(member);
		System.out.println("TreeSet �߰��� ȸ�� : " + member.getMemberID());
	}

	// ȸ�� ����
	public boolean removeMember(int memberID) {
		Iterator<Member> iterator = treeSet.iterator(); // ��ȸ��

		while (iterator.hasNext()) { // ȸ���� �����ϴ� ���� �ݺ�
			Member member = iterator.next(); // �Ѹ��� ȸ���� ������ member�� ����
			if (member.getMemberID() == memberID) { // �Ű������� ���޹��� ���̵�� ����Ʈ�� ȸ�� ���̵� �����ϴٸ�
				treeSet.remove(member);
				System.out.println("treeSet ���� " + memberID + " ����!!!");
				return true;
			}
		}
		System.out.println(memberID + " �������� ���� ȸ���Դϴ�");
		return false;
	}

	public void showAllMember() { // ȸ�� ���� ���
		for (Member member : treeSet) {
			System.out.println(member);
		}
		System.out.println();

	}
}
