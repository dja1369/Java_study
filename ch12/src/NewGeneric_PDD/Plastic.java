package NewGeneric_PDD;

public class Plastic extends Material{
	@Override 
	public String toString() { //Ŭ���� ��� ���� ����.
		return "��ᰡ �ö�ƽ �Դϴ�.";
	}

	@Override
	public void toDoPrint() { //�߻� �޼ҵ� ����.
		System.out.println("�ö�ƽ���� ��� �˴ϴ�");
	}
}
