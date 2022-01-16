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
			throw new NotExistException("null������ �Ҽ� �����ϴ�");
		if(!id.equals(ID)) { //equals �� �ݴ� �� !����.equals(����) not to equals is !value.equals(value)
			throw new NotExistException("�������� �ʴ� ���̵� �Դϴ�.");
		}if(!pw.equals(PW)) {
			throw new WrongPWException("�߸��� �н����� �Դϴ�.");
		}
		System.out.println("�α��ο� ���� �Ͽ����ϴ�.");
	}
	
	
}
