package exception;

public class AutoCloseObject implements AutoCloseable {

	@Override
	public void close() throws Exception {
		System.out.println("���ҽ��� AutoCloseObject ���� close() �Ǿ����ϴ�.");
		
	}

}
