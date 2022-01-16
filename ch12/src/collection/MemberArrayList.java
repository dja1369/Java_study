package collection;

import java.util.ArrayList;

public class MemberArrayList {
	private ArrayList<Member> memberArrayList;
	
	public MemberArrayList() {
		super();
		memberArrayList = new ArrayList<Member>();
	
	}
	//ȸ���� ��ü �迭�� �߰� �ϴ� �޼ҵ�
	public void addMember(Member member ) {
		memberArrayList.add(member);
	}
	public void insertMember(Member member , int index) {
		if (index <0 || index > memberArrayList.size()) {
			System.out.println(" ������ ��ġ�� �߰� �Ҽ� �����ϴ�");
			return ;
		}
		System.out.println(index + " �� ��ġ�� �߰� �Ǿ����ϴ�");
		memberArrayList.add(index , member);
	}
	
	//ȸ���� ��ü �迭���� ����
	public boolean delMember(int memberID) {
		/*
		 * for(int i=0; i<memberArrayList.size(); i++) { Member member =
		 * memberArrayList.get(i); //��ü �迭�� i��°�� �ش��ϴ� ��� int tempID =
		 * member.getMemberID(); //ID�� �����Ͽ� �ӽú����� ���� if(tempID == memberID) {//ȸ�� ����Ʈ ����
		 * ��ȸ�� �Ͱ� ID�� ���� �Ҷ� memberArrayList.remove(i); System.out.println(memberID +
		 * "���������� ���� �Ǿ����ϴ�."); return true; } }
		 */
		
		//Enhanced For ������ ����
		for(Member member : memberArrayList) {			
			int tempID = member.getMemberID();
			if(tempID == memberID) {
				memberArrayList.remove(member);
				System.out.println(memberID + " ���̵� ȸ���� ���� �Ǿ����ϴ�.");
				return true;
			}
		}
		System.out.println(memberID +" ��ϵ��� ���� ����� �Դϴ�.");
		return false;
	}

	//ȸ�� ���� ��� �ϴ� �޼ҵ�
	public void ShowInfo() {
		for(Member member : memberArrayList) {
			System.out.println(member);
		}
	}
	
	
}
