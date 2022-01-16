package exception;

public class IDFormatTest {

	public static void main(String[] args) {
		IDFormat idTest = new IDFormat();
		//setUserID() 메소드가 호출되는 블록에서 예외 처리를 직접 담당.
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
