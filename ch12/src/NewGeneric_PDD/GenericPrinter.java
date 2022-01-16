package NewGeneric_PDD;

public class GenericPrinter<T extends Material> {
	private T material; //���׸�Ÿ������ ����
	
	public void setMaterial(T material) { //Setter
		this.material = material;
	}

	public T getMaterial() { //Getter
		return material;
	}
	public void toDoPrint() {	//abstract Method. �߻������� �ۼ� �Ǿ� ��ü�� �ٸ��� ���� �ϱ⿡ ���⼺ ����
		material.toDoPrint();
	}
	
	public void toPrint() { // Created Method.
		material.toPrint();
	}
}
