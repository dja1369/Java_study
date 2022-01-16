package polymorphism;

public class BronzeCustomer extends Customer{
	private double salesRatio;

	public BronzeCustomer(int customerId , String customerName ) {
		super(customerId,customerName); //�θ��� �Ű����� �����ڸ� ȣ��
		customerGrade = "Bronze"; //�⺻ VIP ���
		bonusRatio = 0.03;	//���ʽ� �������� 1%
		salesRatio = 0.05;
		System.out.println("BronzeCustomer(int customerId , String customerName) ������ ȣ��");
	}
	
	
	@Override
	public int calcPrice(int price) {
		//�żҵ� ���� ���̵� : �θ��� �ż���� ����Ÿ���� ��ġ �Ͼ�� �ϰ� 
 		//�żҵ� �̸� , �Ű������� Ÿ�� , �Ű����� �� ������ ��� ��ġ�ϴ� �޼ҵ带 �����Ѱ�(������)
 		bonusPoint += (price * bonusRatio);		  //���ʽ� ����Ʈ ����.
 		return price = price - (int)(price * salesRatio); //���� �ݾ� ��ȯ.
	
	}


	public double getSalesRatio() {
		return salesRatio;
	}

	public void setSalesRatio(double salesRatio) {
		this.salesRatio = salesRatio;
	}
	
	
}
