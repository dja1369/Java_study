package exception;

public class PWFormatTest {

	public static void main(String[] args) {
		
		PWFormat pwTest = new PWFormat();
		//setUserID() �޼ҵ尡 ȣ��Ǵ� ��Ͽ��� ���� ó���� ���� ���.
		String userpw = null;
		
			try {
				pwTest.setPass(userpw);
			} catch (PWFormatException e) {
				System.out.println(e.getMessage());
			}
			
		userpw = "ONLYSTRING";
		try {
			pwTest.setPass(userpw);
		} catch (PWFormatException e) {
			System.out.println(e.getMessage());
		}
		userpw = "123";
		try {
			pwTest.setPass(userpw);
		} catch (PWFormatException e) {
			System.out.println(e.getMessage());
		}
		
		userpw = "123Pas1sward";
		try {
			pwTest.setPass(userpw);
			System.out.println("������ ��� ��ȣ :" + pwTest.getPass());
		} catch (PWFormatException e) {
			System.out.println(e.getMessage());
		}
	}

}
