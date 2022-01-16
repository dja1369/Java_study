package exception;


public class NotExistException extends Exception {
	
	public NotExistException(String ID) {
		super(ID);
	}
}
