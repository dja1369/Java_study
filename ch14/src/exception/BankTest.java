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
			System.out.println("잔액보다 많은 금액은 인출할수 없습니다");
		}
		System.out.println(customer);
		
		
	}

}
