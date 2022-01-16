package collection;

import java.util.ArrayList;

class MyQueue {
	private ArrayList<String> arrayQueue = new ArrayList<String>();
	private ArrayList<Member> memberQueue = new ArrayList<Member>();
	
	// 회원 추가 
	public void enMember(Member member) {
		memberQueue.add(member);
		System.out.println("맨 뒤에 " + member + " 이 추가 되었습니다.");	
	}
	
	
	// 문자열을 추가하는 메소드
	public void enQueue(String str) {
		arrayQueue.add(str);
		System.out.println("맨 뒤에 " + str + " 이 추가 되었습니다.");
	}

	// 큐에서 멤버 삭제하는 메소드
	
	public Member deMember() {
		int count = memberQueue.size();
		System.out.println("멤버 인원 : " + count);
		if (count == 0 ) {
			System.out.println("Queue 가 비었습니다 . ");
			return null;
		}
		System.out.print("삭제된 멤버 : ");
		return memberQueue.remove(0);
	}
	
	//큐에서 문자열을 삭제하는 메소드
	public String deQueue() { // 맨 앞에서 삭제 됨
		//큐에 남아 있는 데이터 체크
		int count = arrayQueue.size();	
		System.out.println("데이터 개수 : " + count);
		if (count == 0) {
			System.out.println("Queue 가 비었습니다.");
			return null;
		}
		System.out.println("삭제된 문자열 : ");
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
		
		myMember.enMember(new Member(1001, "홍길동"));
		
		myMember.deMember();
		myMember.deMember();
	}

}
