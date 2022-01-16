package collection.map;

import java.util.HashMap;
import java.util.Iterator;

import collection.Member;

public class MemberHashMap {
	private HashMap<Integer, Member> hashMap;

	public MemberHashMap() {
		hashMap = new HashMap<Integer, Member>();
	}
	
	//ȸ�� �߰� 
	public void addMember(Member member) {
		hashMap.put(member.getMemberID(), member); // Key And Value ������ ���� �ؽøʿ� �߰� �Ͼ�� ��.
	}
	
	//ȸ�� ���� 
	public boolean removeMemebr(int memberID) {
		if(hashMap.containsKey(memberID)) { //hashMap �� key ������ �Ѿ�� �Ű� ������ ȸ�� ���̵� �ִٸ� 
			hashMap.remove(memberID); //key�� �ش��ϴ� memberID�� ȸ���� ����
			System.out.println(memberID + " ȸ���� ���� �մϴ�.");
			return true;
		}
		System.out.println(memberID + " ���̵� �� �������� �ʾƿ�.");
		return false;
	}
	
	
	//��� ȸ�� ���
	public void showAllMember() { //Key�� ���� ã�Ƽ� �׿� �ش�Ǵ� Value ���� ã�� ���.
		System.out.println("================ȸ������================");
		Iterator<Integer> ir = hashMap.keySet().iterator();
		//��ȸ�ڸ� Ű ������ Set ���� ���� ��ȯ
		while(ir.hasNext()) { //key ���տ� ���� ��Ұ� ������
			int key = ir.next(); //��� ���� Key ������ ����.
			Member member = hashMap.get(key); //key���� �ش�Ǵ� value(member)
			System.out.println(member);
		}
	}
	
}
