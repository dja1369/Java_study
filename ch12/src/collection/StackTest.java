package collection;

import java.util.ArrayList;

class MyStack {
	private ArrayList<Integer> arrayStack = new ArrayList<Integer>();
	private ArrayList<Member> memberStack = new ArrayList<Member>();
	
	//회원 추가
	public void pushMember(Member member) {
		memberStack.add(member);
		//System.out.println("맨 위에 회원이 1명 추가 되었습니다"+ member);
	}
	
	// 데이터 추가
	public void push(int data) {
		arrayStack.add(data);
		System.out.println("push OK : " + data);
	}
	//회원 삭제
	public Member popMember() {
		int top = memberStack.size();
		
		if(top == 0) {
			System.out.println("회원을 삭제할 데이터가 없습니다");
			return null;
		}
		System.out.print("삭제된 회원 : ");
		return memberStack.remove(top-1);
	}
	
	// 데이터 삭제
	public int pop() {
		int range = arrayStack.size();
		if (range == 0) {
			System.out.println("Stack is Empty");
			return -99999;
		}
		return arrayStack.remove(range - 1);
	}

	// 데이터 꺼내어 보기
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
		
		memberStack.pushMember(new Member(2001, "정경호"));
		memberStack.pushMember(new Member(2002, "조정석"));
		memberStack.pushMember(new Member(2003, "유연석"));
		
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
