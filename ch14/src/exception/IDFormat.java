package exception;

public class IDFormat {
	private String userID;

	public String getUserID() {
		return userID;
	}
	//�޼ҵ尡 ȣ��� �� , ����ϴ� �κп��� ó���ϵ��� �̷�.
	public void setUserID(String userID) throws IDFormatException { //���̵� ���� ������ ����
		//���� ���ǰ� ���� ���� ���, ���� �߻� ��Ŵ
		if (userID == null) {
			throw new IDFormatException("���̵�� null���� �ɼ� �����ϴ�");
		}else if (userID.length() < 9 || userID.length() > 20) {
			throw new IDFormatException("���̵�� 8�� �̻� 20 �� �̳��� �Է��ϼ���.");
		}
			this.userID = userID; //���ǿ� ���յǴ� ���� ���̵� �Ű����� ������ ����
	}
	
	
}
