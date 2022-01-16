package collection.map;

import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.TreeMap;

import collection.Member;

public class MemberTreeMap  {
	private TreeMap<Integer, Member> treeMap;

	public MemberTreeMap() {
	//TreeMap�� �����ڿ� Collections.reverseOrder() �Ű� ������ �����ϸ� ��Ҹ� �߰��Ҷ� �ݴ�� ������
	treeMap = new TreeMap<Integer, Member>(Collections.reverseOrder());
	}
	//ȸ�� �߰�
	public void addMember(Member member) {
		treeMap.put(member.getMemberID(), member);
	}
	//ȸ�� ����
	public boolean removeMember(int memberID) {
		if(treeMap.containsKey(memberID)) {
			treeMap.remove(memberID);
			System.out.println(memberID+ " ���̵� ����");
			return true;
		}
		System.out.println(memberID + " ���̵�� �������� ���� ");
		return false;
	}
	
	//ȸ�� ���� ���
	public void showAllMember() {
		System.out.println("================ȸ������================");
		//TreeMam ���� ���� ��� value �� ����ͼ� ��Ұ� �ִµ��� ��� ��� �� ���
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
