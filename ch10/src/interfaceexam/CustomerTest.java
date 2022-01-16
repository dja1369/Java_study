package interfaceexam;

public class CustomerTest {

	public static void main(String[] args) {
		Customer customer = new Customer();

		// �������� �޼ҵ尡 ȣ��
		customer.buy();
		customer.sell();

		Buy buyer = customer; 
		buyer.buy();
		buyer.order(); //���Ե� �ν��Ͻ��� �޼ҵ尡 ȣ��

		Sell seller = customer;
		seller.sell();
		seller.order(); //���� �޼ҵ� �� ���� , ������ �� �޼ҵ尡 ȣ��.
		// downcasting �Ұ�� ������ �߻��Ҽ� �����Ƿ� Ÿ�� üũ �ݵ�� �ؾ���
		if (seller instanceof Customer) { //[��ü] instanceof [Ŭ���� �ڷ���]
			Customer newCustomer = (Customer) seller; // ���� ����ȯ (�����)
			System.out.println("�ٿ� ĳ���� ��� �޼��� ȣ��");
			newCustomer.buy();
			newCustomer.sell();
			newCustomer.order();
		} else {
			System.out.println("��ȯ �Ҽ� ���� Ÿ��");
		}

	}
}
