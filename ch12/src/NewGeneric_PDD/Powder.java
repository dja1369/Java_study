package NewGeneric_PDD;

public class Powder extends Material{
	@Override
	public String toString() {
		return "재료가 파우더 입니다.";
	}

	@Override
	public void toDoPrint() {
		System.out.println("파우더 로 출력 됩니다.");
	}
}
