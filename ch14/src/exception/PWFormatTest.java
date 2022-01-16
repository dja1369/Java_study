package exception;

public class PWFormatTest {

	public static void main(String[] args) {
		
		PWFormat pwTest = new PWFormat();
		//setUserID() 메소드가 호출되는 블록에서 예외 처리를 직접 담당.
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
			System.out.println("설정된 비밀 번호 :" + pwTest.getPass());
		} catch (PWFormatException e) {
			System.out.println(e.getMessage());
		}
	}

}
