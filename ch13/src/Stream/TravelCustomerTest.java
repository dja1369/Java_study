package Stream;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class TravelCustomerTest {

	public static void main(String[] args) {

		List<TravelCustomer> customerList = new ArrayList<TravelCustomer>();
		
		customerList.add(new TravelCustomer("�̿���", 6, 50));
		customerList.add(new TravelCustomer("������", 42, 100));
		customerList.add(new TravelCustomer("��ȫ��", 29, 100));
		
		/*
		 * for(TravelCustomer customer : customerList) { System.out.println(customer);
		 * //toString() �ڵ� ȣ�� }
		 */
		//���ٽ��� �̿��� �� ����Ʈ�� ���� ��� 
		customerList.stream().forEach(customer -> System.out.println(customer));
		System.out.println(" === �� ��ܿ� �߰��� ���� ���� ���� �̸� === ");
		//��Ʈ�� ���κ��� ���� �̸��� ������ ��� ���� ������ ���
		customerList.stream().map(customer -> customer.getName()).sorted().forEach(customer -> System.out.println(customer));
	
		//�� ���� ��� ��� ��� ���
		int totalCost = customerList.stream().mapToInt(customer -> customer.getPrice()).sum();
		System.out.println("���� �� ����� " + totalCost + " ���� �Դϴ�.");
	
		System.out.println(" === 20�� �̻�� ��� �������� ���� �Ͽ� ��� === ");
		customerList.stream().filter(customer -> customer.getAge() >= 20)
		.map(customer -> customer.getName()).sorted(Comparator.reverseOrder()).forEach(customer -> System.out.println(customer));
	}
	
}
