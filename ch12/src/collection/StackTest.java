package collection;

import java.util.ArrayList;

class MyStack {
	private ArrayList<Integer> arrayStack = new ArrayList<Integer>();
	private ArrayList<Member> memberStack = new ArrayList<Member>();
	
	//ȸ�� �߰�
	public void pushMember(Member member) {
		memberStack.add(member);
		//System.out.println("�� ���� ȸ���� 1�� �߰� �Ǿ����ϴ�"+ member);
	}
	
	// ������ �߰�
	public void push(int data) {
		arrayStack.add(data);
		System.out.println("push OK : " + data);
	}
	//ȸ�� ����
	public Member popMember() {
		int top = memberStack.size();
		
		if(top == 0) {
			System.out.println("ȸ���� ������ �����Ͱ� �����ϴ�");
			return null;
		}
		System.out.print("������ ȸ�� : ");
		return memberStack.remove(top-1);
	}
	
	// ������ ����
	public int pop() {
		int range = arrayStack.size();
		if (range == 0) {
			System.out.println("Stack is Empty");
			return -99999;
		}
		return arrayStack.remove(range - 1);
	}

	// ������ ������ ����
	public int peek() {
		int range = arrayStack.size();
		if (range != 0) {
			return arrayStack.get(range-1);
		}
		System.out.println("Stack is Empty");
		return -99999;
	}

}

public class StackTest {

	public static void main(String[] args) {
		
		MyStack memberStack = new MyStack();
		
		memberStack.pushMember(new Member(2001, "����ȣ"));
		memberStack.pushMember(new Member(2002, "������"));
		memberStack.pushMember(new Member(2003, "������"));
		
		Member member = memberStack.popMember();
		System.out.println(member);
		System.out.println(memberStack.popMember());
		System.out.println(memberStack.popMember());
		System.out.println(memberStack.popMember() == null ? "" : member);
		
		/*
		 * MyStack myStack = new MyStack();
		 * 
		 * myStack.push(100); myStack.push(200); myStack.push(300); myStack.push(400);
		 * 
		 * System.out.println(myStack.pop()); System.out.println(myStack.pop());
		 * System.out.println(myStack.peek()); System.out.println(myStack.pop());
		 * System.out.println(myStack.pop()); System.out.println(myStack.pop());
		 */	}

}
