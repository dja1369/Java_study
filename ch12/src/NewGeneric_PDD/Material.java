package NewGeneric_PDD;

public abstract class Material { // �߻� Ŭ����
	public abstract void toDoPrint(); //�߻� �޼ҵ�
	public void toPrint(){ // Created Method.
		System.out.println("������ �⿡ ������ ��� �� " + getClass().getSimpleName() + " ���� ��µ˴ϴ�");
	}
}
