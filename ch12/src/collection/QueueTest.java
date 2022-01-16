package collection;

import java.util.ArrayList;

class MyQueue {
	private ArrayList<String> arrayQueue = new ArrayList<String>();
	private ArrayList<Member> memberQueue = new ArrayList<Member>();
	
	// ȸ�� �߰� 
	public void enMember(Member member) {
		memberQueue.add(member);
		System.out.println("�� �ڿ� " + member + " �� �߰� �Ǿ����ϴ�.");	
	}
	
	
	// ���ڿ��� �߰��ϴ� �޼ҵ�
	public void enQueue(String str) {
		arrayQueue.add(str);
		System.out.println("�� �ڿ� " + str + " �� �߰� �Ǿ����ϴ�.");
	}

	// ť���� ��� �����ϴ� �޼ҵ�
	
	public Member deMember() {
		int count = memberQueue.size();
		System.out.println("��� �ο� : " + count);
		if (count == 0 ) {
			System.out.println("Queue �� ������ϴ� . ");
			return null;
		}
		System.out.print("������ ��� : ");
		return memberQueue.remove(0);
	}
	
	//ť���� ���ڿ��� �����ϴ� �޼ҵ�
	public String deQueue() { // �� �տ��� ���� ��
		//ť�� ���� �ִ� ������ üũ
		int count = arrayQueue.size();	
		System.out.println("������ ���� : " + count);
		if (count == 0) {
			System.out.println("Queue �� ������ϴ�.");
			return null;
		}
		System.out.println("������ ���ڿ� : ");
		return arrayQueue.remove(0);
	}
	
}

public class QueueTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * MyQueue myQueue = new MyQueue();
		 * 
		 * myQueue.enQueue("aaa"); myQueue.enQueue("bbb"); myQueue.enQueue("ccc");
		 * 
		 * System.out.println(myQueue.deQueue()); System.out.println(myQueue.deQueue());
		 * System.out.println(myQueue.deQueue());
		 */
		
		MyQueue myMember = new MyQueue();
		
		myMember.enMember(new Member(1001, "ȫ�浿"));
		
		myMember.deMember();
		myMember.deMember();
	}

}
