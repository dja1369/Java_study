package inheritance;

public class CustomerTest {

	public static void main(String[] args) {
		Customer customer = new Customer();
		
		customer.setCustomerId(1001);
		customer.setCustomerName("�浿ȫ");
		customer.setBonusPoint(1000);
		System.out.println(customer.showCustomerInfo());
		VIPCustomer vip = new VIPCustomer();
		vip.setCustomerId(2001);
		vip.setCustomerName("�ֿ��");
		System.out.println(vip.showCustomerInfo());
	
	}

}
