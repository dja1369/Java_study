package generic;

public abstract class Material {
	public abstract void doPrinting(); //�߻� �޼ҵ�
	public void printing() { 	//������ �Ϲ� �޼ҵ�
		System.out.println("�����ͱ⿡ ������ " + getClass().getSimpleName() + " ���� ��� �մϴ�.");
	}

}
