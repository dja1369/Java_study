package collection;


public class MemberArrayListTest {

	public static void main(String[] args) {
		MemberArrayList memberArrayList = new MemberArrayList();
		//회원 생성
		Member member1 = new Member(1001, "홍길동");
		Member member2 = new Member(1002, "김길순");
		Member member3 = new Member(1003, "이덕수");
		Member member4 = new Member(1004, "김성욱");
		//회원 객체 배열에 추가
		memberArrayList.addMember(member1);
		memberArrayList.addMember(member2);
		memberArrayList.addMember(member3);
		
		memberArrayList.insertMember(member4, 1);
		
		
		//회원 객체 배열에서 삭제
		memberArrayList.delMember(1000);
		
		//회원 정보 출력
		memberArrayList.ShowInfo();
		
	}

}
