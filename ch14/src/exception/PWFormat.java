package exception;

public class PWFormat {
	private String pass;

	public String getPass() {
		return pass;
	}

	public void setPass(String pass) throws PWFormatException{
		if(pass == null) {
			throw new PWFormatException("��й�ȣ�� Null �� �ɼ� �����ϴ�");
		}else if(pass.matches("[a-zA-Z]+")) { //�߰�ȣ�� ~����~���� ���� ǥ�� ����
			throw new PWFormatException("��й�ȣ�� ���ڿ����θ� �̷������ �����ϴ�.");
		}else if(pass.length() <= 5) {
			throw new PWFormatException("��� ��ȣ�� 5�ڸ� �̸����� �̷������ �����ϴ�");
		}
		this.pass = pass;
	}
	
}
