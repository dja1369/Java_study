package interfaceexam;

public class Customer implements Buy,Sell {

	@Override
	public void sell() {
		System.out.println("sell()");
	}

	@Override
	public void buy() {
		System.out.println("buy()");
	}

	@Override
	public void order() { //�ߺ��� ����Ʈ �żҵ�� �������̽��� ������ Ŭ���� ���� �ݵ�� ������ �ؾ� �Ѵ�.
		System.out.println("Customer order()");
	}

}
