package collection;

import java.util.ArrayList;

public class MemberArrayList {
	private ArrayList<Member> memberArrayList;
	
	public MemberArrayList() {
		super();
		memberArrayList = new ArrayList<Member>();
	
	}
	//회원을 객체 배열에 추가 하는 메소드
	public void addMember(Member member ) {
		memberArrayList.add(member);
	}
	public void insertMember(Member member , int index) {
		if (index <0 || index > memberArrayList.size()) {
			System.out.println(" 지정된 위치에 추가 할수 없습니다");
			return ;
		}
		System.out.println(index + " 번 위치에 추가 되었습니다");
		memberArrayList.add(index , member);
	}
	
	//회원을 객체 배열에서 삭제
	public boolean delMember(int memberID) {
		/*
		 * for(int i=0; i<memberArrayList.size(); i++) { Member member =
		 * memberArrayList.get(i); //객체 배열의 i번째에 해당하는 요소 int tempID =
		 * member.getMemberID(); //ID만 추출하여 임시변수에 저장 if(tempID == memberID) {//회원 리스트 에서
		 * 조회된 것과 ID가 동일 할때 memberArrayList.remove(i); System.out.println(memberID +
		 * "성공적으로 삭제 되었습니다."); return true; } }
		 */
		
		//Enhanced For 문으로 변경
		for(Member member : memberArrayList) {			
			int tempID = member.getMemberID();
			if(tempID == memberID) {
				memberArrayList.remove(member);
				System.out.println(memberID + " 아이디 회원이 삭제 되었습니다.");
				return true;
			}
		}
		System.out.println(memberID +" 등록되지 않은 사용자 입니다.");
		return false;
	}

	//회원 정보 출력 하는 메소드
	public void ShowInfo() {
		for(Member member : memberArrayList) {
			System.out.println(member);
		}
	}
	
	
}
