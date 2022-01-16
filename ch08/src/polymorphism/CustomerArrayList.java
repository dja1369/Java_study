package polymorphism;

import java.util.ArrayList;

public class CustomerArrayList {

	public static void main(String[] args) {
		ArrayList<Customer> customerList = new ArrayList<Customer>();
		
		//��ü �迭�� ���� Ŭ���� Ÿ�Կ� ����� �ν��Ͻ� �߰�
		customerList.add(new Customer(10100, "ä��ȭ"));
		customerList.add(new Customer(10200, "���ͼ�"));
		customerList.add(new BronzeCustomer(10510, "�����"));
		customerList.add(new BronzeCustomer(10510, "�Ƿ���"));		
		customerList.add(new GoldCustomer(20100, "���ؿ�"));
		customerList.add(new GoldCustomer(20200, "������"));
		customerList.add(new VIPCustomer(30100, "�豤��",123456));
		
		System.out.println("============������ ���==============");
		for(Customer customer : customerList) {
			System.out.println(customer.showCustomerInfo());
		}
		System.out.println("============���� �ݾװ� ����Ʈ==============");
		
		int price = 10000;
		for(Customer customer : customerList) {
			int cost = customer.calcPrice(10000);
			System.out.println(customer.getCustomerName()+ " ������ ���� �Ͻ� �ݾ���");
			System.out.println(customer.calcPrice(price));
			System.out.println("���ʽ� ����Ʈ�� " + customer.bonusPoint + " �� �Դϴ�.");
		}
			
		
	}

}
