package collection;


public class MemberArrayListTest {

	public static void main(String[] args) {
		MemberArrayList memberArrayList = new MemberArrayList();
		//ȸ�� ����
		Member member1 = new Member(1001, "ȫ�浿");
		Member member2 = new Member(1002, "����");
		Member member3 = new Member(1003, "�̴���");
		Member member4 = new Member(1004, "�輺��");
		//ȸ�� ��ü �迭�� �߰�
		memberArrayList.addMember(member1);
		memberArrayList.addMember(member2);
		memberArrayList.addMember(member3);
		
		memberArrayList.insertMember(member4, 1);
		
		
		//ȸ�� ��ü �迭���� ����
		memberArrayList.delMember(1000);
		
		//ȸ�� ���� ���
		memberArrayList.ShowInfo();
		
	}

}
