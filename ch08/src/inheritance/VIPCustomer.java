package inheritance;

public class VIPCustomer extends Customer{
	private double salesRatio; //������
 	private int agentId; // ���� ����
	
	
	public VIPCustomer() {
		//super() , Customer() �����Ϸ� �� �ڵ����� ����Ʈ �����ڷ� �θ��� �����ڸ� ȣ��
		customerGrade = "VIP"; //�⺻ VIP ���
		bonusRatio = 0.05;	//���ʽ� �������� 1%
		//System.out.println("VIPCustomer() ������ ȣ��");
	}
 	
 	//���̵�� �̸��� �Ű������� ���� ������
 	public VIPCustomer(int customerId , String customerName , int agentId) {
		super(customerId,customerName); //�θ��� �Ű����� �����ڸ� ȣ��
		this.agentId=agentId;
		customerGrade = "VIP"; //�⺻ VIP ���
		bonusRatio = 0.05;	//���ʽ� �������� 1%
		System.out.println("VIPCustomer(int customerId , String customerName) ������ ȣ��");
	}
	
 	@Override
	public int calcPrice(int price) {
 		//�żҵ� ���� ���̵� : �θ��� �ż���� ����Ÿ���� ��ġ �Ͼ�� �ϰ� 
 		//�żҵ� �̸� , �Ű������� Ÿ�� , �Ű����� �� ������ ��� ��ġ�ϴ� �޼ҵ带 �����Ѱ�(������)
 		bonusPoint += (price * bonusRatio);		  //���ʽ� ����Ʈ ����.
 		return price = (int)(price * salesRatio); //���� �ݾ� ��ȯ.
	}

	public String showCustomerInfo() { // �� ���� �� ��ȯ , �޼ҵ带 ������ �ϴ°��� (overriding : �������̵�) �̶� �Ѵ�.
		/*return super.getCustomerName()+ " ���� �� ����� " + customerGrade + " �̸�, ���ʽ� ����Ʈ��" + bonusPoint + " �� �Դϴ�."
	+ "���� ���� �� ���̵�� " + agentId + " �Դϴ�. ";*/
 		return super.showCustomerInfo()+ "���� ���� �� ���̵� �� " + agentId + " �Դϴ�!";
	}

	public int getAgentId() {
		return agentId;
	}

	
}
