package exception;

public class AutoCloseObject implements AutoCloseable {

	@Override
	public void close() throws Exception {
		System.out.println("리소스가 AutoCloseObject 에서 close() 되었습니다.");
		
	}

}
