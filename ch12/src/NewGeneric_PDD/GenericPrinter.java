package NewGeneric_PDD;

public class GenericPrinter<T extends Material> {
	private T material; //제네릭타입으로 선언
	
	public void setMaterial(T material) { //Setter
		this.material = material;
	}

	public T getMaterial() { //Getter
		return material;
	}
	public void toDoPrint() {	//abstract Method. 추상적으로 작성 되어 객체별 다르게 셋팅 하기에 다향성 구현
		material.toDoPrint();
	}
	
	public void toPrint() { // Created Method.
		material.toPrint();
	}
}
