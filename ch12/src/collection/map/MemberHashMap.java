package collection.map;

import java.util.HashMap;
import java.util.Iterator;

import collection.Member;

public class MemberHashMap {
	private HashMap<Integer, Member> hashMap;

	public MemberHashMap() {
		hashMap = new HashMap<Integer, Member>();
	}
	
	//회원 추가 
	public void addMember(Member member) {
		hashMap.put(member.getMemberID(), member); // Key And Value 쌍으로 값을 해시맵에 추가 하어야 함.
	}
	
	//회원 삭제 
	public boolean removeMemebr(int memberID) {
		if(hashMap.containsKey(memberID)) { //hashMap 에 key 값으로 넘어온 매개 변수의 회원 아이디가 있다면 
			hashMap.remove(memberID); //key에 해당하는 memberID의 회원을 삭제
			System.out.println(memberID + " 회원을 삭제 합니다.");
			return true;
		}
		System.out.println(memberID + " 아이디 는 존재하지 않아요.");
		return false;
	}
	
	
	//모든 회원 출력
	public void showAllMember() { //Key를 먼저 찾아서 그에 해당되는 Value 값을 찾아 출력.
		System.out.println("================회원정보================");
		Iterator<Integer> ir = hashMap.keySet().iterator();
		//순회자를 키 정보를 Set 으로 얻어와 반환
		while(ir.hasNext()) { //key 집합에 다음 요소가 있을때
			int key = ir.next(); //요소 값을 Key 변수에 보관.
			Member member = hashMap.get(key); //key값에 해당되는 value(member)
			System.out.println(member);
		}
	}
	
}
