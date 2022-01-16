package exception;


public class AccountException extends Exception{

	public AccountException(String haveCash) {
		super(haveCash);
	}

}
