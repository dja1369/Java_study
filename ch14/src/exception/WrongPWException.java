package exception;

public class WrongPWException extends Exception {
	public WrongPWException(String pass) {
		super(pass);
	}
}
