package inheritance;

public class OverrideTest {

	public static void main(String[] args) {
		Customer vc = new VIPCustomer(10030, "������", 2345);
		vc.bonusPoint = 1000;
		
		System.out.println(vc.showCustomerInfo()); // �Ŭ������ ������ ȣ��ǳ�?
		
		int cost = vc.calcPrice(10000);
		System.out.println(vc.getCustomerName()+ " �� ���� ���� �ݾ��� " + cost + " �̰� ���ʽ� ����Ʈ �� "
		+ vc.getBonusPoint()+ " �� �Դϴ�.");
	}

}
