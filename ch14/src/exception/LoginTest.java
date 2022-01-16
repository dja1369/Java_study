package exception;

public class LoginTest {

	public static void main(String[] args) {
		Create people = new Create("bill", "lucky");
		
		try {
			people.login("Bill", "Lucky");
		} catch (NotExistException | WrongPWException e) {
			System.out.println(e.getMessage());
		}
		System.out.println("=============================");
		try {
			people.login("bill", "Lucky");
		} catch (NotExistException | WrongPWException e) {
			System.out.println(e.getMessage());
		}
		System.out.println("=============================");
		
		try {
			people.login("bill", "lucky");
		} catch (NotExistException | WrongPWException e) {
			System.out.println(e.getMessage());
		}
		System.out.println("=============================");
		
		try {
			people.login(null, null);
		} catch (NotExistException e) {
			System.out.println(e.getMessage());
		} catch (WrongPWException e) {
			System.out.println(e.getMessage());
		}
	}
/
}
