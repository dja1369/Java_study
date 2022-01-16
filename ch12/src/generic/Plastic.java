package generic;

public class Plastic extends Material {
	@Override
	public String toString() {
		return "재료가 Plastic 입니다.";
	}

	@Override
	public void doPrinting() {
		// TODO Auto-generated method stub
		System.out.println("Plastic 재료로  출력을 합니다.");
	}
}
