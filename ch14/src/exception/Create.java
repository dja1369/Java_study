package exception;


public class Create {
	private String ID;
	private String PW;
	
	public Create(String iD, String pW) {
		ID = iD;
		PW = pW;
	}
	public void login(String id , String pw) throws NotExistException, WrongPWException {
		if(id == null && pw == null )
			throw new NotExistException("null값으로 할수 없습니다");
		if(!id.equals(ID)) { //equals 의 반대 는 !변수.equals(변수) not to equals is !value.equals(value)
			throw new NotExistException("존재하지 않는 아이디 입니다.");
		}if(!pw.equals(PW)) {
			throw new WrongPWException("잘못된 패스워드 입니다.");
		}
		System.out.println("로그인에 성공 하였습니다.");
	}
	
	
}
