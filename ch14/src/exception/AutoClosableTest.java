package exception;

public class AutoClosableTest {

	public static void main(String[] args) {
		//Java 7 try-with-resources ���� ������ close() ����� ���� ȣ�� ���� �ʾƵ� ��� ���ҽ��� ��Ȯ�� ����
		AutoCloseObject obj3 = new AutoCloseObject();
		//Java 9 ���ʹ� try���� ��ȣ �ܺο� ���ҽ��� �����ؼ� ��� ���� : �������� ���� , �ݺ����� �پ� �� ���� 
		try (/*
				 * AutoCloseObject obj1 = new AutoCloseObject(); AutoCloseObject obj2 = new
				 * AutoCloseObject();
				 */
				obj3;){
			System.out.println("���ҽ��� �ϳ� ����");
			/*
			 * System.out.println("���ҽ��� �ϳ� �� ����"); System.out.println("���ҽ��� �ΰ� �� ����");
			 */			//�� ���� ���� �Ǵ� ��츦 Ȯ���ϱ� ���� , ������ ���ܸ� �߻� 
			throw new Exception("���� ���� ���� ����");
		}catch(Exception e) {
			System.out.println("Exception Handling");
			System.out.println(e);
		}
		System.out.println("���� ����");
	}

}
