package exception;

public class PWFormat {
	private String pass;

	public String getPass() {
		return pass;
	}

	public void setPass(String pass) throws PWFormatException{
		if(pass == null) {
			throw new PWFormatException("비밀번호는 Null 이 될수 없습니다");
		}else if(pass.matches("[a-zA-Z]+")) { //중괄호는 ~부터~까지 범위 표현 가능
			throw new PWFormatException("비밀번호는 문자열으로만 이루어질수 없습니다.");
		}else if(pass.length() <= 5) {
			throw new PWFormatException("비밀 번호는 5자리 미만으로 이루어질수 없습니다");
		}
		this.pass = pass;
	}
	
}
