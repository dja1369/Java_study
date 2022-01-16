package exception;

public class BankTest {

	public static void main(String[] args) {
		Account customer = new Account(10000);
		
		try {
			customer.setInputCash(10000);
		} catch (AccountException e) {
			System.out.println(e.getMessage());
		}
		System.out.println(customer);
		
		try {
			customer.setInputCash(0);
		} catch (AccountException e) {
			System.out.println(e.getMessage());
		}
		System.out.println(customer);
		
		try {
			customer.setOutputCash(30000);
		} catch (AccountException e) {
			System.out.println(e.getMessage());
		}
		try {
			customer.setOutputCash(10000);
		} catch (AccountException e) {
			System.out.println("�ܾ׺��� ���� �ݾ��� �����Ҽ� �����ϴ�");
		}
		System.out.println(customer);
		
		
	}

}
