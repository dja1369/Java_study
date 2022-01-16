package exception;

public class IDFormat {
	private String userID;

	public String getUserID() {
		return userID;
	}
	//메소드가 호출될 때 , 사용하는 부분에서 처리하도록 미룸.
	public void setUserID(String userID) throws IDFormatException { //아이디 제약 조건을 설정
		//제약 조건과 맞지 않을 경우, 예외 발생 시킴
		if (userID == null) {
			throw new IDFormatException("아이디는 null값이 될수 없습니다");
		}else if (userID.length() < 9 || userID.length() > 20) {
			throw new IDFormatException("아이디는 8자 이상 20 자 이내로 입력하세요.");
		}
			this.userID = userID; //조건에 부합되는 경우는 아이디를 매개변수 값으로 설정
	}
	
	
}
