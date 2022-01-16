package NewGeneric_PDD;

public class Plastic extends Material{
	@Override 
	public String toString() { //클래스 출력 내용 변경.
		return "재료가 플라스틱 입니다.";
	}

	@Override
	public void toDoPrint() { //추상 메소드 정의.
		System.out.println("플라스틱으로 출력 됩니다");
	}
}
