package exception;

public class IDFormatTest {

	public static void main(String[] args) {
		IDFormat idTest = new IDFormat();
		//setUserID() �޼ҵ尡 ȣ��Ǵ� ��Ͽ��� ���� ó���� ���� ���.
		String userID = null;
		
		try {
			idTest.setUserID(userID);
		} catch (IDFormatException e) {
			System.out.println(e.getMessage());
		}
		
		userID = "test123";
	
		try {
			idTest.setUserID(userID);
		} catch (IDFormatException e) {
			System.out.println(e.getMessage());
		}
		
		userID = "dsaihdakjsfh1321312";
		
		try {
			idTest.setUserID(userID);
		} catch (IDFormatException e) {
			System.out.println(e);
		}
		
		
		
	}
}
